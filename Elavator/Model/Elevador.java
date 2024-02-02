package Model;



public class Elevador {
    private int andarDesejado;
    private int andarAtual;
    private int elevador1;
    private int elevador2;

    public Elevador(int andarDesejado, int andarAtual, int elevador1, int elevador2) {
        this.andarDesejado = andarDesejado;
        this.andarAtual = andarAtual;
        this.elevador1 = elevador1;
        this.elevador2 = elevador2;
    }
    public Elevador(){}

    public int getAndarDesejado() {
        return andarDesejado;
    }
    
    public void setAndarDesejado(int andarDesejado) {
        this.andarDesejado = andarDesejado;
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getElevador1() {
        return elevador1;
    }
    public void setElevador1(int elevador1) {
        this.elevador1 = elevador1;
    }
    public int getElevador2() {
        return elevador2;
    }
    public void setElevador2(int elevador2) {
        this.elevador2 = elevador2;
    }

   

  
}
