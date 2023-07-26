package RevisaoPOO.Cadastro;

public abstract class Animal {
    // atributos
    String nome;
    double peso;
    String especie;
    String proprietario;

    // metodos
    // contrutor cheio
    public Animal(String nome, double peso, String especie, String proprietario) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
        this.proprietario = proprietario;
    }

    // contrutor vazio

    public Animal() {
    }

    // get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
