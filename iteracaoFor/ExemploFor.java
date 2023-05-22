package iteracaoFor;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

import sc.nextInt;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void Exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" o numero da  iteração é" + i);
        }
    }

    public void Exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" o vetor []" + i + "]=");
            vetor[i] = sc.nextInt();

        }
        // imprimir na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println(" o vetor []" + i + "]=" + vetor[i]);
        }
    }

    public void Exemplo3() {
        double carrinho[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        double valorFinal = 0;
        for (int i = 0; i < carrinho.length; i++) {
            valorFinal += carrinho[i];
            System.out.println("valor parcial da compra" + valorFinal);
        }
        System.out.println(" valor final da compra é" + valorFinal);
    }

    public void Exemplo4() {
        double vetorNota[] = new double[4];
        for (int i = 0; i < vetorNota.length; i++) {
            System.out.println("digite a nota" + (i + 1) + ";");
            vetorNota[i] = sc.nextDouble();
        }
        double mediaNotas = 0;
        for (int i = 0; i < vetorNota.length; i++) {
            mediaNotas += vetorNota[i];
            System.out.println("a" + (i + 1) + "  1° nota" + vetorNota[i]);
        }
        mediaNotas /= vetorNota.length;
        System.out.println("a media é %.2f " + mediaNotas);
    }

    public void Exemplo5() {
        // vetor guardadr medias
        double vetorMedia[] = new double[3];
        // preencher medias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("nota" + (j + 1) + "Aluno" + (i + 1) + ";");
                notas += sc.nextDouble();
            }
            notas /= 4; // calcular as notas
            vetorMedia[i] = notas; // colocar media no vetor

        }
        // imprimir noas >=7 do vetor 7
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println(" a media do aluno " + (i + 1) + " é " + vetorMedia[i]);

            }
        }
    }

    public void Exemplo6() {
        double vetor[] = new double[5];
        double soma = 0;
        double multi = 1;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite um numero inteiro" + (i + 1));
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            System.out.println("valor da soma" + soma);
        }
        for (int i = 0; i < vetor.length; i++) {
            multi *= vetor[i];
            System.out.println("valor da multi" + multi);
        }
        System.out
                .println("numero digitado" + vetor + "resultado da soma" + soma + "resultado da multiplicação" + multi);
    }

    public void Exemplo7() {
        double idade[] = new double[5];
        double altura[] = new double[5];
        for (int i = 0; i < altura.length; i++) {
            System.out.println(" digite a altura " + (i + 1));
            altura[i] = sc.nextDouble();
        }
        for (int i = 0; i < idade.length; i++) {
            System.out.println(" digite a idade " + (i + 1));
            idade[i] = sc.nextDouble();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(" o altura " + i + "=" + altura[i]);
            System.out.println(" o idade  " + i + "=" + idade[i]);
        }
    }
    public void Exemplo8() {
        int vetorA[]= new int[10];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(" Digite um numero inteiro ");
            vetorA[i]=sc.nextInt();
        }
        int multi;
        int soma;
        for (int i = 0; i < vetorA.length; i++) {
            multi =vetorA[i]*vetorA[i];
            System.out.println(" o resultado da multi foi de "+multi);
           vetorA[i]=multi;
        }
         int valor=0;
        for (int i = 0; i < vetorA.length; i++) {
         
            
        }
    }
}
