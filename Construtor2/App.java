package Construtor2;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
      Random rd= new Random();
        Scanner sc = new Scanner(System.in);
       Agenda pessoas[] = new Agenda[2];
      for (int i = 0; i < pessoas.length; i++) {
        pessoas[i] = new Agenda();
        System.out.println("informe o nome");
        pessoas[i].setNome(sc.nextLine());
        pessoas[i].setAltura(sc.nextDouble());
        pessoas[i].setIdade(sc.nextInt());
        
      }
      System.out.println(""+pessoas[0].getNome());
        
    }
}
