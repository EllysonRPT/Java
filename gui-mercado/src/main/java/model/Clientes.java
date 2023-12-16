package Model;

public class Clientes {

    // atributos
    private String cpf;
    private String nome;

    // contrutor
    public Clientes(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // metodos
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

}
