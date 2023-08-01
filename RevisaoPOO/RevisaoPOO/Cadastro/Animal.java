package RevisaoPOO.Cadastro;

public abstract class Animal {
    // atributos
    String nome;
    double peso;
    String raca;
    String proprietario;
static int RA;
    // metodos
    // contrutor cheio
public Animal(String nome, double peso, String raca, String proprietario, int rA) {
    this.nome = nome;
    this.peso = peso;
    this.raca = raca;
    this.proprietario = proprietario;
    RA = rA;
}
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
public String getRaca() {
    return raca;
}
public void setRaca(String raca) {
    this.raca = raca;
}
public String getProprietario() {
    return proprietario;
}
public void setProprietario(String proprietario) {
    this.proprietario = proprietario;
}
public static int getRA() {
    return RA;
}
public static void setRA(int rA) {
    RA = rA;
}
   
    // contrutor vazio

}
