package ArrayList;
import java.util.*;
public class ExArrayList {
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new  ArrayList<Integer>(); 
         numeros.add(1);
         numeros.add(2);
         numeros.add(3);
         numeros.add(4);
         numeros.add(5);
         Collections.sort(numeros);
 for (int i = 0; i < numeros.size(); i++) {
    System.out.println(numeros.get(i));
 }
  Collections.reverse(numeros);
  for (Integer i: numeros) {
    System.out.println(i+10);
  }
    }

    
}
