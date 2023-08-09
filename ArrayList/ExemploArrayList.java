package ArrayList;

import java.util.*;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList <String> carros = new ArrayList <String> ();
        List carros1 = new ArrayList<>(); //coleção
        carros.add("fusca");
        carros.add("monza");
        carros.add("vectra");
        carros.add("brasilia");
        carros.add("chevette");
         Collections.sort(carros);
        for (int i = 0; i < carros.size(); i++) {
                  System.out.println(carros.get(i));
        }
         //ordenar uma lista(sort - Collections)
         Collections.reverse(carros);
        //iterando com o for each
        for (String i : carros) {
             System.out.println(i);
        }
  
        carros.clear();// apaga o arraylist
        System.out.println(carros);
    }
}
