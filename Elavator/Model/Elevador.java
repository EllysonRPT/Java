package Model;
import Controll.*;


public class Elevador {
    private int andarDesejado;
    private int andarAtual;
    private int elevador1;
    private int elevador2;

    public Elevador(int andarAtual, int elevador1, int elevador2) {
        this.andarAtual = andarAtual;
        this.elevador1 = elevador1;
        this.elevador2 = elevador2;
    }

   

    private void moverElevador(int elevador, int andarDesejado) {
        // Lógica para mover o elevador até o andar desejado
        // Atualiza o andarAtual do elevador
        this.andarAtual = andarDesejado;
    }

  
}
