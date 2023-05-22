package Operadores;

import java.util.Scanner;

public class NotaAluno { 
    Scanner sc = new Scanner(System.in);
    public void notasequecial() {
        System.out.println("Informe a nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = (nota1+nota2)/2;
        System.out.println("A média do aluno é");
        boolean mediaAprovado=mediaAluno>=50;
        System.out.println("o aluno está aprovado por nota?"+mediaAprovado);
        System.out.println("Informe a frequencia do aluno");
        int  frequeciaAluno = sc.nextInt();
        boolean frequeciaAprovado = frequeciaAluno>= 75;
        System.out.println("O aluno está aprovado por frequencia?");
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequeciaAprovado==true);
        System.out.println("o aluno está aprovado no curso?"+aprovacaoFinal);
    }


    
}
