package AtividadeConstrutor;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa("Mario", 1.70, 20, 12, 1970);//defult
        System.out.println(" INFORME O NOME ");
        pessoa1.setNome(sc.next());

        System.out.println(" A idade é"+pessoa1.calcularIdade()); 
        pessoa1.ImprimirInfo();
        sc.close();

        Pessoa turma[] = new Pessoa[100];
        for (int i = 0; i < turma.length; i++) {
            turma[i]=new Pessoa(null, i, i, i, i);
        }
    }
    /*public static void main(String[] args) {
        atribuir valores ao atributos
       
    }*/
   
}
