package RevisaoPOO.Cadastro;

public abstract class Animal {
    // atributos
    String nome;
    double peso;
    String raca;
    String proprietario;

    // metodos
    // contrutor cheio
    public Animal(String nome, double peso, String raca, String proprietario) {
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
        this.proprietario = proprietario;
    }

    // contrutor vazio

}
