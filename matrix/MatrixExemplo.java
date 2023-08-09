package matrix;

import java.util.Random;
import java.util.Scanner;

public class MatrixExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo() {
        // criar uma matrix 10x9 preencher imprimir e manipular
        // declara a marix
        int[][] matriz = new int[10][9]; // 10linha 9colunas
        // prenche a minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {

                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        // imprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("| ");
        }
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {

            somaLinha += matriz[3][i];
        }
        int somaColuna = 0;
        System.out.println("++++++++++++++++++");
        System.out.println("soma da 4 linha" + somaLinha);
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("++++++++++++++++++");
        System.out.println("soma da 4 linha" + somaColuna);
    }

    public void exemplo2() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;

                }

            }

        }
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("| ");
        }
    }

private void exemplo3() {
    int matriz[][]= new int[4][4];
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz [i][j] = rd.nextInt(4);
        }
        
    }
    for (int i = 0; i < 4; i++) {
        System.out.print("| ");
        for (int j = 0; j < 4; j++) {
            System.out.print(matriz[i][j] + " ");
  }
  System.out.println("| ");
  }
  for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz.length; j++) {
        if (matriz[i][0]) {
            
        }else {

        }
        
    }
    
  }
  
 }
}