package AtividadeConstrutor;

public class Pessoa {
 private String nome;
 private double altura;
 private int DNascimento;
 private int MNascimento;
 private int ANascimento;

public Pessoa(String nome, double altura, int dNascimento, int mNascimento, int aNascimento) {
    this.nome = nome;
    this.altura = altura;
    DNascimento = dNascimento;
    MNascimento = mNascimento;
    ANascimento = aNascimento;
}
public void Pessoa() {
    
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getNascimento() {
    return DNascimento;
}
public void setNascimento(int nascimento) {
    this.DNascimento = nascimento;
}
public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}
public int getDNascimento() {
    return DNascimento;
}
public void setDNascimento(int dNascimento) {
    DNascimento = dNascimento;
}
public int getMNascimento() {
    return MNascimento;
}
public void setMNascimento(int mNascimento) {
    MNascimento = mNascimento;
}
public int getANascimento() {
    return ANascimento;
}
public void setANascimento(int aNascimento) {
    ANascimento = aNascimento;
}
//METODOS IMPRIMIR
public int calcularIdade() {
    int idade;
    if (DNascimento<=29 && MNascimento<=5) {
        idade=2023 -ANascimento;
    }else{
        idade= 2023 - ANascimento -1;
    }
    return  idade;

}
public void ImprimirInfo() {
    System.out.println("NOME:"+nome);
    System.out.println("ALTURA:"+altura);
    System.out.println("NASCIMENTO:"+DNascimento+"/"+MNascimento+"/"+ANascimento);

}
 
}
