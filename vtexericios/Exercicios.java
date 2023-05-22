package vtexericios;

import java.util.Scanner;

public class Exercicios {
    /**
     *
     */
    Scanner sc = new Scanner(System.in);


    public void exercicios1() {
        int vetorA[]= new int[]{5,10,15,20,25};
        int vetorB[]= new int[5];
        vetorB[0]=vetorA[0];
        vetorB[1]=vetorA[1];
        vetorB[2]=vetorA[2];
        vetorB[3]=vetorA[3];
        vetorB[4]=vetorA[4];
        System.out.println("o vetor B é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);        
    }
    public void exercicios2() {
        int vetorA [] = new int[]{10,20,30,40,50};
        int vetorB [] = new int[]{vetorA[0]*2,vetorA[1]*2,vetorA[2]*2,vetorA[3]*2,vetorA[4]*2,vetorA[5]*2,vetorA[6]*2,vetorA[7]*2};  
        System.out.println("o vetor B é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);                  
    }
public void exercicios3() {
    int vetorA[]= new int[]{5,10,15,20,25,30,35,40};
        int vetorB[]= new int[5];
        vetorB[0]=vetorA[0]*vetorA[0];
        vetorB[1]=vetorA[1]*vetorA[1];
        vetorB[2]=vetorA[2]*vetorA[2];
        vetorB[3]=vetorA[3]*vetorA[3];
        vetorB[4]=vetorA[4]*vetorA[4];
        vetorB[5]=vetorA[5]*vetorA[5];
        vetorB[6]=vetorA[6]*vetorA[6];
        vetorB[7]=vetorA[7]*vetorA[7];
        System.out.println("o vetor B é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);  
        System.out.println(vetorB[5]);      
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
    }
    public void exercicios4() {
        int vetorA[]= new int[]{5,10,15,20,25,30,35,40};
        double vetorB[]= new double[8];
        vetorB[0]=Math.sqrt(vetorA[0]);
        vetorB[1]=Math.sqrt(vetorA[1]);
        vetorB[2]=Math.sqrt(vetorA[2]);
        vetorB[3]=Math.sqrt(vetorA[3]);
        vetorB[4]=Math.sqrt(vetorA[4]);
        vetorB[5]=Math.sqrt(vetorA[5]);
        vetorB[6]=Math.sqrt(vetorA[6]);
        vetorB[7]=Math.sqrt(vetorA[7]);
        System.out.println("o vetor B é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);  
        System.out.println(vetorB[5]);      
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        
    }
    public void exercicios5() {
        int vetorA[]= new int[]{5,10,15,20,25,30,35,40,45,50};
        int vetorB[]= new int[10];
        vetorB[0]=vetorA[0]*0;
        vetorB[1]=vetorA[1]*1;
        vetorB[2]=vetorA[2]*2;
        vetorB[3]=vetorA[3]*3;
        vetorB[4]=vetorA[4]*4;
        vetorB[5]=vetorA[5]*5;
        vetorB[6]=vetorA[6]*6;
        vetorB[7]=vetorA[7]*7;
        System.out.println("o vetor B é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);  
        System.out.println(vetorB[5]);      
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        
    }
public void exercicios6() {
    int vetorA[]= new int[]{5,10,15,20,25,30,35,40,45,50};
        int vetorB[]= new int[]{5,10,15,20,25,30,35,40,45,50};
        int vetorC[]= new int[10];
        vetorC[0]=vetorA[0]+vetorB[0];
        vetorC[1]=vetorA[1]+vetorB[1];
        vetorC[2]=vetorA[2]+vetorB[2];
        vetorC[3]=vetorA[3]+vetorB[3];
        vetorC[4]=vetorA[4]+vetorB[4];
        vetorC[5]=vetorA[5]+vetorB[5];
        vetorC[6]=vetorA[6]+vetorB[6];
        vetorC[7]=vetorA[7]+vetorB[7];
        System.out.println("o vetor B é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);  
        System.out.println(vetorB[5]);      
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
}

    
}

