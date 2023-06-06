package Construtor2;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {
      //criar array de objetos
      Random rd= new Random();
        Scanner sc = new Scanner(System.in);
       Agenda contatos[] = new Agenda[10];
       //criar e preencher objetos
      for (int i = 0; i < contatos.length; i++) {
        contatos[i] = new Agenda();
        System.out.println("informe o nome");
        contatos[i].setNome(JOptionPane.showInputDialog("NOME"));
        contatos[i].setIdade(i+18);
        contatos[i].setAltura(rd.nextDouble(1.5,2));
        
      }
      //busca pelo nome
      String nomeBuscado = JOptionPane.showInputDialog("INFORME O NOME BUSCADO");
      int cont=0;//contador
      boolean procure=true;
      while (procure) {//enquanto procure for verdadeiro loop
        if (nomeBuscado.equals(contatos[cont].getNome())) {
          procure=false;//parar laço
          JOptionPane.showMessageDialog(null, "idade: "+contatos[cont].getIdade()+"\n altura: " +contatos[cont].getAltura());
        }
        cont++;
      }

        
    }
}
