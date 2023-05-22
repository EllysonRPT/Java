package EstrururaDesisaoif;
import java.time.temporal.IsoFields;
import java.util.Scanner;

public class Decisaoif {
    Scanner sc = new Scanner(System.in);

    public void calcularDescontoif() {
        
        System.out.println("informe o valor do produto");
        double precoProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        if (precoProduto >= 200 && precoProduto < 300) { // Estrutura de desisão if// Desconto para produtos de alto
                                                         // valor.
            percentualDesconto = 10.0;
        }

        if (precoProduto >= 100 && precoProduto < 200) {
            percentualDesconto = 5.0;
        }
        if (precoProduto >= 300) {
            percentualDesconto = 15.0;
        }
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");

    }
    //Decisão if desencadeada
    /**
     * 
     */
    public void DecisaoifElse(){
        System.out.println("infrome o valor do produto");
        var precoProduto= sc.nextDouble();
        double percentualDesconto;
        //Estrutura de decição encadeada 
        if(precoProduto>=300){
           percentualDesconto=15.0;
        }
        else  if(precoProduto>=200){
         percentualDesconto = 10.0;
        }
        else if(precoProduto>=100){

        }
        else{percentualDesconto = 0; 
        }
        //Regra de três
        final double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");
    }
 
}
