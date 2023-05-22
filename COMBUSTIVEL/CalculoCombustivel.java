package COMBUSTIVEL; // pasta 

public class CalculoCombustivel {
    public static void main(String[] args) {
        int distanciaPercorrida = 200; //
        int valorCombustivel = 5;
        int ConsumoKm = 8;
        double Litrosgasto = distanciaPercorrida / ConsumoKm;
        double ValorGasto = Litrosgasto * valorCombustivel;

        System.out.println("O valor gasto em combutivel foi de " + "R$" + ValorGasto);
    }

}
