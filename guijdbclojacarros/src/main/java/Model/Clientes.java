package Model;

public class Clientes {
    // atributos
    private String cpf; // Alterado de "marca" para "cpf"
    private String nome; // Alterado de "modelo" para "nome"

    // construtor
    public Clientes(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // gets e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Object getClientesComboModel() {
        return null;
    }
}
