package Iteracaowhile;

import java.util.Random;
import java.util.Scanner;

public class Exemplowhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 10) {
            iteracao += 1;
            System.out.println("essa é interação de numero" + iteracao);
        }
    }

    public void exemplo2() {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(5);
        boolean tentarNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento, para parar.");
        // Enquanto tentarNovamente igual a true, itera novamente.
        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            // Repare que a relação abaixo e a de diferença,
            // enquanto diferente, retorna true e, por isso,
            // tenta novamente.

            tentarNovamente = numeroAleatorio != numero;
            if (tentarNovamente) {
                System.out.println("Errado!");

            }
        }
        System.out.println("Parabéns! Você adivinhou. Era o número"
                + numeroAleatorio + " mesmo.");
        System.out.println("Fim!");
        System.out.println("============================");
    }

    public void exemplo3() {
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("digite o valor para o vetor[" +i+ "]");
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println("o valor do vetor"+i+" é "+vetor[i]);
            i++;
        }
    }
}