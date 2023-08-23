package Iteracaowhile;

import java.util.Scanner;

public class ExerciciosExtra {
    Scanner sc = new Scanner(System.in);

    public void Extra1() {
        /*
         * String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i",
         * "j" };
         * // char letras[] = new char[]{'a','b','c','d',"e","f","h","i","j",}
         * int i = 0;
         * int cont = 0;
         * while (i < letras.length) {
         * if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] ==
         * "o" || letras[i] == "u") {
         * 
         * } else {
         * cont++;
         * 
         * System.out.println(letras[i] + "  é consoante");
         * }
         * i++;
         * }
         * System.out.println("o numero de consoante é " + cont);
         */
        System.out.println("digite uma palavra ");
        String letras = sc.next();
        letras = letras.toLowerCase();
        int consoante = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c + "  é vogal  ");
            } else {
                System.out.println(c + "  é consoante" + consoante);
                consoante++;
            }

        }
    }

    public void Extra2() {
        /*
         * int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
         * 16, 17, 18, 19, 20 };
         * int contImpar = 0;
         * int contPar = 0;
         * int i = 0;
         * while (i < vetor.length) {
         * if (vetor[i] % 2 == 0) {
         * contPar++;
         * } else {
         * contImpar++;
         * }
         * i++;
         * }
         * int vetorPar[] = new int[contPar];
         * int vetorImpar[] = new int[contImpar];
         * i = 0;
         * contPar = 0;
         * contImpar = 0;
         * while (i < vetor.length) {
         * if (vetor[i] % 2 == 0) {
         * vetorPar[contPar] = vetor[i];
         * contPar++;
         * } else {
         * vetorImpar[contImpar] = vetor[i];
         * contImpar++;
         * }
         * i++;
         * }
         * 
         * i = 0;
         * while (i < vetor.length) {
         * System.out.println("vetor[" + i + "]=" + vetor[i]);
         * i++;
         * }
         * i=0;
         * while (i < vetorPar.length) {
         * System.out.println("vetorPar[" + i + "]=" + vetorPar[i]);
         * i++;
         * }
         * i=0;
         * while (i < vetorImpar.length) {
         * System.out.println("vetorImpar[" + i + "]=" + vetorImpar[i]);
         * i++;
         * }
         */
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contImpar = 0;
        int contPar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];

        contImpar = 0;
        contPar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (nPar[contPar] % 2 == 0) {
                contPar++;
            } else {
                nImpar[contImpar] = numeros[i];
                contImpar++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("vetor [" + i + "]=" + numeros[i]);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("vetor [" + i + "]=" + nPar[i]);
        }
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("vetor [" + i + "]=" + nImpar[i]);
        }

    }

    public void Extra3() {
        int senha=1234;
        
    }
}
