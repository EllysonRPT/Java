package AtividadePOO;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public void ex1() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        // declara a marix
        int linha;
        int coluna;

        System.out.println("informe a quantida de linha");
        linha = sc.nextInt();
        System.out.println("informe a quantida de linha ");
        coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("| ");
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else if (j > i) {
                    matriz[i][j] = 2;
                }

            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("| ");
        }
    }

    public void ex2() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int sorteado;
        int cont = 0;
        boolean tentarNovamente = true;
        sorteado = rd.nextInt(1000);
        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            tentarNovamente = sorteado != numero;
            if (numero > sorteado) {
                System.out.println("mais pra baixo");
            } else if (numero < sorteado) {
                System.out.println("mais pra cima");
            } else if(numero==sorteado){
                System.out.println("Parabéns! Você adivinhou. Era o número" + sorteado + " mesmo.");

            }
            cont++;
        }
        System.out.println("Voçê tentou " + cont + " vezes ");
        System.out.println("Fim!");
        System.out.println("============================");
    }

    public void ex3() {
        Random rd = new Random();
        int contPar = 0;
        int contImpar = 0;

        int vetor[] = new int[rd.nextInt(5, 10)];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1, 100)+1;
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("PAR " + vetor[i]);

            } else if (vetor[i] % 2 != 0) {

                System.out.println("IMPAR " + vetor[i]);
            }

        }
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                contPar++;

            }
        }
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                contImpar++;
          
            }
        }System.out.println("PARES NA CASA IMPAR "+contPar);
        System.out.println("IMPARES  NA CASA PAR "+contImpar);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+", ");
        }
        }
    }
    // segunda forma
    /* int contImparNaPar = 0;
    int contParNaImpar = 0;
    for (int i = 0; i < vetor.length; i++) {
        if(vetor[i]%2==1){//resto == 1
            System.out.println(vetor[i]);
            // se esta na cada par
            if(i%2==1){//casa par
                contImparNaPar++;
            }
        }
    }
    //procurar os nº Pares
    for (int i = 0; i < vetor.length; i++) {
        if(vetor[i]%2==0){//resto == 0
            System.out.println(vetor[i]);
            if(i%2==0){//casa Impar
                contParNaImpar++;
            }
        }
    }
*/
