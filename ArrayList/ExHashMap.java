package ArrayList;

import java.util.*;

public class ExHashMap {
    public static void main(String[] args) {
    //     HashMap<String,String> cpitalCity = new HashMap<>();
    //     cpitalCity.put("SP", "LIMEIRA");
    //     cpitalCity.put("RJ", "RIO DE JANEIRO");
    //     cpitalCity.put("MG", "BELO HORIZONTE");
    //     cpitalCity.put("ES", "VITÓRIA");
    //   //IMPRIME VALOR CORREPONDENTE A CHAVES
    //     System.out.println(cpitalCity.get("ES"));

    //     System.out.println(cpitalCity.keySet());
    //     System.out.println(cpitalCity);
    //     for (String i : cpitalCity.keySet()) {
    //         System.out.println(cpitalCity.get(i));
    //     }
        //IMPRIMIR CHAVES E VALORES
HashMap<String,String> nomeIdade = new HashMap<>();
        nomeIdade.put("HEBERT", "65");
        nomeIdade.put("DIOGO", "36");
        nomeIdade.put("GABRIEL", "35");
        nomeIdade.put("CELSO", "60");
      //IMPRIME VALOR CORREPONDENTE A CHAVES
        System.out.println(nomeIdade.get("hebert"));

        System.out.println(nomeIdade.keySet());
        System.out.println(nomeIdade);
        for (String i : nomeIdade.keySet()) {
            System.out.println(nomeIdade.get(i));
        }
        
    }
}
