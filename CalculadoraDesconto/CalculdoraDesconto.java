package CalculadoraDesconto;

import java.util.Scanner;

/**
 * CalculdoraDesconto
 */
public class CalculdoraDesconto { // classe
  public void calcular20 () {   //metodo
Scanner sc = new Scanner(System.in); 
  double precoProduto = sc.nextDouble(); // Digitar o preço do produto
  final int desconto20=20;
  double precoComDesconto = precoProduto-
  (precoProduto*desconto20/100);
 System.out.println ("o preço com desonto é" + precoComDesconto + "reais");
 sc.close();
    }
    public void calcular30 () {   //metodo
      Scanner sc = new Scanner(System.in); 
      double precoProduto = sc.nextDouble(); // Digitar o preço do produto
      final int desconto30=20;
      double precoComDesconto = precoProduto-
      (precoProduto*desconto30/100);
     System.out.println ("o preço com desonto é" + precoComDesconto + "reais");
     sc.close();
    }  

    
}