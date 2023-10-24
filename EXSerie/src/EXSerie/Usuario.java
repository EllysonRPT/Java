package EXSerie;

import java.io.Serializable;

public class Usuario implements Serializable {
    // atributos
    String nome;
    int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



//OPERAÇÃO USUARIO

    private List<Usuario> usuarios;
    private DefaultTableModel tableModel;
    private JTable table;

    public OperacoesUsuarios(List<Usuario> usuarios, DefaultTableModel tableModel, JTable table) {
        this.usuarios = usuarios;
        this.tableModel = tableModel;
        this.table = table;
    }

    // metodo crud
    public void cadastrarUsuario(String nome, String idade) {
        int idadeInt = Integer.parseInt(idade);
        Usuario usuario = new Usuario(nome, idadeInt);
        usuarios.add(usuario);
        atualizarTabela();
    }

    public void atualizarUsuario(int linhaSelecionada, String nome, String idade) {
        if (linhaSelecionada != -1) {
            int idadeInt = Integer.parseInt(idade);
            Usuario usuario = new Usuario(nome, idadeInt);
            usuarios.set(linhaSelecionada, usuario);
            atualizarTabela();
        }
    }

    public void apagarUsuario(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            usuarios.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosUsuarios() {
        usuarios.clear();
        atualizarTabela();
    }

    public void salvarUsuarios() {
        Serializacao.serializar("dados.txt", usuarios);
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() });
        }
    }





    // Método para serializar uma lista de usuários em um arquivo binário
    public static void serializar(String arquivo, List<Usuario> usuarios) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {

            // Escreve a lista de usuários no arquivo especificado
            outputStream.writeObject(usuarios);
            System.out.println("Dados serializados com sucesso.");
        } catch (IOException e) {
            // Em caso de erro na serialização, imprime a mensagem de erro
            System.err.println("Erro ao serializar os dados: " + e.getMessage());
        }
    }

    // Método para deserializar uma lista de usuários a partir de um arquivo binário
    public static List<Usuario> deserializar(String arquivo) {
        try {
            // Abre o arquivo para leitura
            ObjectInputStream inputStream = new ObjectInputStream(new

            FileInputStream(arquivo));

            // Lê a lista de usuários do arquivo e a converte de volta para a lista
            return (List<Usuario>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Em caso de erro na deserialização, imprime a mensagem de erro
            System.err.println("Erro ao deserializar os dados: " + e.getMessage());
            return null; // Retorna nulo para indicar que ocorreu um erro
        }
    }

}