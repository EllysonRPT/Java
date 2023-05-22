package GRUPO;

import java.util.Scanner;

public class Imc {
    public void Exercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = sc.nextLine();
        System.out.println("digite sua idade");
        double Idade = sc.nextDouble();
        System.out.println("digite sua Altura ");
        double altura = sc.nextDouble();
        System.out.println("digite seu sexo 1=m ou 2=F");
        double sexo = sc.nextDouble();
        System.out.println("informe seu peso");
        double pesoReal = sc.nextDouble();
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;

        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }
        System.out.println(" Seu peso ideal deve ser " + pesoIdeal);
        double peso =  pesoIdeal - pesoReal ;
        if (peso<0) {
        System.out.println(nome+ " Precisa perder "  +peso + " kg ");  
        }
        else if (peso>0) {
            System.out.println(nome+ " Precisa ganhar "  +peso + " kg ");  
            }
            else{
                System.out.println(nome+" está no peso ideal ");
            }

        double iMC = pesoReal / (altura * altura);
        if (iMC < 20) {
            System.out.println("SÓ PELE OSSO");

        } else if (iMC > 20 && iMC < 27) {
            System.out.println("PESO SENSACIONAL");

        } else if (iMC>27) { System.out.println("EMAGRECER URGENTE");
            
        }
           
        
         
        if (Idade>=16 && Idade<=25) { System.out.println("Atividades: musculação moderada,musculação leve, luta, dança,ioga ");
            
         } else if (Idade>=25 && Idade<=35) {System.out.println("Atividades: musculação intensa,musculação moderada, luta, dança,ioga,corrida ");
            
         } else if (Idade>=36 && Idade<=45) {System.out.println("Atividades: musculação intensa,musculação moderada, luta, dança,ioga,corrida ");
            
         } else if (Idade>=46 && Idade<=55) {System.out.println("Atividades:musculação moderada,musculação leve, luta, dança,ioga,corrida,pilates ");
            
            
         }else if (Idade>=56 && Idade<=65) {System.out.println("Atividades:musculação leve, dança,ioga,corrida,pilates ");
    }   
     else  {System.out.println("Atividades:musculação leve, dança,ioga,pilates ");
}
}
}