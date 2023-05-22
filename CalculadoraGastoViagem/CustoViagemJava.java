package CalculadoraGastoViagem;

class CustoViagemJava {

   //Custo Viagem 

   public static void main(String[] args) {
 System.out.println("Gasto total da viagem");
 double distânciaPercorrida = 5711;
 double valorDoCombustível = 5;
 double consumoDoCarro = 10;
 double quilometroPorLitro = distânciaPercorrida/consumoDoCarro;
 double totalGasto = quilometroPorLitro*valorDoCombustível;
 System.out.println(totalGasto);

 
}
}