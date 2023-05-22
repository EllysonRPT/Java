package AtividadeRevisao;

import java.util.Scanner;

import javax.xml.validation.Validator;

public class Rexemplo {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        System.out.println("digitr um numero");
        double numero = sc.nextDouble();
        if (numero > 10) {
            System.out.println("o numero é maior que dez");
        } else {
            System.out.println("o numero não e maior que dez");
        }
    }

    public void exemplo2() {
        System.out.println("digite o numero de horas trabalahadas");
        double horastrabalhada = sc.nextDouble();
        System.out.println("informe o valo da hr");
        double precohora = sc.nextDouble();
        double salario = precohora * horastrabalhada;
        double hrextras = horastrabalhada-200;
        double salarioTotal= horastrabalhada*precohora+hrextras*precohora*50/100;
        System.out.println("o salario total é"+salarioTotal);

    } 

    public void exemplo3() {
        System.out.println("digite o salario do funcionario");
        double SalarioFixo 

        
     }

}
