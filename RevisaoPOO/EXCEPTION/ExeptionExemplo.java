package EXCEPTION;

import java.util.Scanner;

public class ExeptionExemplo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean aberta=true;
        while (aberta) {       
        try {
        System.out.print("Digite um valor inteiro..:");
        int numero1 = s.nextInt();
        System.out.print("Digite um valor inteiro..:");
        int numero2 = s.nextInt();
        System.out.println(numero1+ " + " + numero2 + "= " + (numero1+numero2));
        } catch (Exception e) {
        System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
        }
        }
    }
}
