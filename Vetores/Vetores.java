package Vetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        double[] valores = new double[]{10.5,15.8,7.5,-17.6};
        System.out.println("o primeiro elemento do vetor - valores{0} é"+valores[0]);
        System.out.println("o primeiro elemento do vetor - valores{1} é"+valores[1]);
        System.out.println("o primeiro elemento do vetor - valores{2} é"+valores[2]);
        System.out.println("o primeiro elemento do vetor - valores{3} é"+valores[3]);
        System.out.println("Digite o valor para a 4 posição/indice 3");
        valores[3]=sc.nextDouble();
        System.out.println("O novo valor da 4 posição/indice 3"+valores[3]);
        
        
        
    }
    public void exemplo2() {
        // vetor(vazio)
        int[] valoresInt = new int[5];
        System.out.println("digite 5 valores inteiros");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        System.out.println("o  elemento do indide [0] é"+valoresInt);
        System.out.println("o  elemento do indide [1] é"+valoresInt);
        System.out.println("o  elemento do indide [2] é"+valoresInt);
        System.out.println("o  elemento do indide [3] é"+valoresInt);
        System.out.println("o  elemento do indide [4] é"+valoresInt);

        
    }
    public void exemplo3() {

        double[] inteiros= new double[10];
        System.out.println("digite sequencia de 10 numeros");
        inteiros[0]=sc.nextInt();
        inteiros[1]=sc.nextInt();
        inteiros[2]=sc.nextInt();
        inteiros[3]=sc.nextInt();
        inteiros[4]=sc.nextInt();
        inteiros[5]=sc.nextInt();
        inteiros[6]=sc.nextInt();
        inteiros[7]=sc.nextInt();
        inteiros[8]=sc.nextInt();
        inteiros[9]=sc.nextInt();
        System.out.println("o primeiro numero do vetor - valores{0} é"+inteiros[9]);
        System.out.println("o primeiro numero do vetor - valores{1} é"+inteiros[8]);
        System.out.println("o primeiro numero do vetor - valores{2} é"+inteiros[7]);
        System.out.println("o primeiro numero do vetor - valores{3} é"+inteiros[6]);
        System.out.println("o primeiro numero do vetor - valores{4} é"+inteiros[5]);
        System.out.println("o primeiro numero do vetor - valores{4} é"+inteiros[4]);
        System.out.println("o primeiro numero do vetor - valores{4} é"+inteiros[3]);
        System.out.println("o primeiro numero do vetor - valores{4} é"+inteiros[2]);
        System.out.println("o primeiro numero do vetor - valores{4} é"+inteiros[1]);
        System.out.println("o primeiro numero do vetor - valores{4} é"+inteiros[0]);
   

        
    }
    public void exemplo4() {
        double[] notas= new double[4];
        System.out.println("digite 4 notas");
       notas[0]=sc.nextDouble();
       notas[1]=sc.nextDouble();
       notas[2]=sc.nextDouble();
       notas[3]=sc.nextDouble();
       System.out.println("a nota 1 é"+notas[0]);
       System.out.println("a nota 2 é"+notas[1]);
       System.out.println("a nota 3 é"+notas[2]);
       System.out.println("a nota  é"+notas[3]);
       double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
       System.out.println("a media da nota é"+media);

        
    }
}
