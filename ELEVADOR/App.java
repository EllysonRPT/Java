package ELEVADOR;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador Elevador1 = new Elevador(10, 10);
        Elevador1.iniciar();
        // elevador em funcionamento
        boolean ligado = true;
        int atuacao = 0;

        while (ligado) {
            System.out.println("escolha a açõ do elevador:\n" + " 1. ENTRAR PESSOA \n" + " 2. DESCER PESSOA \n"
                    + " 3.ESCOLHA UM ANDAR \n" + " 4. DESLIGAR");

            atuacao = sc.nextInt();
            switch (atuacao) {
                case 1:
                    System.out.println("capacidade" + Elevador1.entrar());
                    break;
                case 2:
                    System.out.println("capacidade" + Elevador1.sair());
                    break;
                case 3:
                    Elevador1.acao(Integer.parseInt(JOptionPane.showInputDialog("informe o andar=")));
                    System.out.println("ANDAR ATUAL " + Elevador1.getAndarAtual());
                    break;
                case 4:
                    ligado = false;
                    break;

                default:
                    System.out.println("Digite um valor válido");

                    break;
            }
        }
    }
}
