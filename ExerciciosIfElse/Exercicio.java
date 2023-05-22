package ExerciciosIfElse;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicio {

  Scanner sc = new Scanner(System.in);

  /**
   * 
   */
  public void Exercicio1() {
    System.out.println("inrforme o valor");
    int Valor1 = sc.nextInt();
    System.out.println();
    int Valor2 = sc.nextInt();
    if (Valor1 > Valor2) {
      System.out.println("o maior valor é" + Valor1);
    } else {
      System.out.println("o maior valor é" + Valor2);
    }

  }

  public void Exercicio2() {
    System.out.println("digite seu ano de nascimento");
    int Nacimento = sc.nextInt();
    int AnoAtual = 2023;
    int Idade = AnoAtual - Nacimento;
    if (Idade >= 16) {
      System.out.println("entao poderá votar");
    } else {
      System.out.println("voce nao podera votar");
    }

  }

  public void Exercicio3() {
    System.out.println("digite a senha");
    int senha = sc.nextInt();
    int senhacorreta = 1234;
    if (senha == senhacorreta) {
      System.out.println("Acesso pemitido");

    } else {
      System.out.println("Acesso negado");
    }

  }

  public void Exercicio4() {
    System.out.println("Digite a quantidade de maçã");
    int quantidade = sc.nextInt();
    double valor = 12;
    if (quantidade >= valor) {
      System.out.println("A maçã custará R$0,25");
    } else {
      System.out.println(" A maçã custara R$0,30");
    }
    double valorcompra = quantidade*valor ; 
    System.out.println("o valor da compra e"+valorcompra);

  }

  public void Exercicio5() {
    System.out.println("digite o valor");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println();
    if (a < b && b < c) {
      System.out.println("A ordem e " + a + "," + b + "," + c);
    } else if (a < c && c < b) {
      System.out.println("A ordem e " + a + "," + c + "," + b);
    } else if (b < c && c < a) {
      System.out.println("A ordem e " + b + "," + c + "," + a);
    } else if (b < a && a < c) {
      System.out.println("A ordem e " + b + "," + a + "," + c);
    } else if (c < a && a < b) {
      System.out.println("A ordem e " + c + "," + a + "," + b);
    } else if (c < b && b < a) {
      System.out.println("A ordem e " + c + "," + b + "," + a);
    }
  }

  public void Exercicio6() {
    System.out.println("digite sua Altura ");
    double Altura = sc.nextDouble();
    System.out.println("digite seu sexo 1=m ou 2=F");
    double Sexo = sc.nextDouble();
    double Peso;
    if (Sexo==1) { 
      Peso=(62.1*Altura)-44.7;
      
    }else{
      Peso= (72.7*Altura)-58;
    }System.out.println("seu peso eu acho que é "+Peso);

  }

  public void Exercicio7() {
    System.out.println("informe a nota do aluno");
    double nota1 = sc.nextDouble();
    System.out.println("informe a nota do aluno");
    double nota2 = sc.nextDouble();
    System.out.println("informe a frequencia");
    int frequencia = sc.nextInt();
    double media = (nota1 + nota2) / 2;

    if (media >= 50 && frequencia >= 75) {
      System.out.println("aprovado");

    } else {
      System.out.println("reprovado");

    }
  }
  public void Exercicio8() {
    System.out.println("digite um numero");
    
    
  }
}