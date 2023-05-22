package Iteracaowhile;

public class ExerciciosWhile {
    public void exercicio1() {
        int vetorA[] = new int[]{3,5,7,11,13};
        int vetorB[] = new int[5];
        int i=0;
        while (1<vetorA.length) {
          vetorB[i]=vetorA[i];
            System.out.println("vetor B["+i+"]="+vetorB[i]);
            i++;
        }
    }
    public void exercicio2() {
        int vetorA[] = new int[]{2,3,5,7,9,11,13,17};
        int vetorB[] = new int[8];
        int i=0;
        while (1<vetorA.length) {
          vetorB[i]=vetorA[i]*2;
            System.out.println("vetor B["+i+"]="+vetorB[i]);
            i++;
        }
        
    }
    public void exercicio3() {
            int vetorA[] = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            int vetorB[] = new int[15];
            int i=0;
            while (1<vetorA.length) {
              vetorB[i]=vetorA[i]*vetorA[i];
                System.out.println("vetor B["+i+"]="+vetorB[i]);
                i++;
    }
}
public void exercicio4() {
    int vetorA[] = new int[]{2,3,4,5,6,7,8,9,10,11};
    double vetorB[] = new double[10];
    int i=0;
    while (1<vetorA.length) {
      vetorB[i]=Math.sqrt(vetorA[i]);
        System.out.println("vetor B["+i+"]="+vetorB[i]);
        i++;
} 
}
public void exercicio5() {
    int vetorA[] = new int[]{2,3,5,6,7,8,9,11,13,17};
    int vetorB[] = new int[10];
    int i=0;
    while (1<vetorA.length) {
      vetorB[i]=vetorA[i]*i;
        System.out.println("vetor B["+i+"]="+vetorB[i]);
        i++;
    } 
}
public void exercicio6() {
    int vetorA[] = new int[]{2,3,5,6,7,8,9,11,13,17};
    int vetorB[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorC[]= new int[10];
    int i=0;
    while (1<vetorA.length) {
      vetorC[i]=vetorA[i]+vetorB[i];
        System.out.println("vetor B["+i+"]="+vetorC[i]);
        i++;
    } 
}
}
