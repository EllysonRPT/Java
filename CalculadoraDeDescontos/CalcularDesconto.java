package CalculadoraDeDescontos;

public class CalcularDesconto {

 public void calcular() {
    double precoProduto = 200;
System.out.println("O preço do produto é de"
+ precoProduto + "reais");  
double percentualDesconto = 20;  
System.out.println("O desconto será de"
+ percentualDesconto + "%");     
// Regra de tres para descobrir qual valor
// do desconto
double desconto = precoProduto*percentualDesconto/100;
//Preço do produto menos o desconto para 
// sabermos o valor do produto com o 
// desconto que foi calculado na linha anterior
double precoComDesconto = precoProduto -desconto;
System.out.println("Com desconto, o prouto sai"
+ "por R$" + precoComDesconto + ".");
System.out.println("Fim");
System.out.println("===============");
 } 

   public void calcular30() {
    double precoProduto = 200;
System.out.println("O preço do produto é de"
+ precoProduto + "reais");  
double percentualDesconto = 30;  
System.out.println("O desconto será de"
+ percentualDesconto + "%");     
// Regra de tres para descobrir qual valor
// do desconto
double desconto = precoProduto*percentualDesconto/100;
//Preço do produto menos o desconto para 
// sabermos o valor do produto com o 
// desconto que foi calculado na linha anterior
double precoComDesconto = precoProduto -desconto;
System.out.println("Com desconto, o prouto sai"
+ "por R$" + precoComDesconto + ".");
System.out.println("Fim");
System.out.println("==============="); 

        
    }
}
