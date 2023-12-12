package Model;

public class Produtos {

  
    private String codBarra;
    private String quantiProduto;
    private String nomeProduto;
    private String valor;

    public Produtos(String string, String string2, String string3, String string4) {
       
        this.codBarra = codBarra;
        this.quantiProduto = quantiProduto;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

   

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getQuantiProduto() {
        return quantiProduto;
    }

    public void setQuantiProduto(String quantiProduto) {
        this.quantiProduto = quantiProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public Object getCpf() {
        return null;
    }
}
