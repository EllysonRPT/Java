package model;

public class Produto {

    private int promocao;
    private int codBarra;
    private int quantiProduto;
    private String nomeProduto;

    public Produto(int promocao, int codBarra, int quantiProduto, String nomeProduto) {
        this.promocao = promocao;
        this.codBarra = codBarra;
        this.quantiProduto = quantiProduto;
        this.nomeProduto = nomeProduto;
    }

    public int getPromocao() {
        return promocao;
    }

    public void setPromocao(int promocao) {
        this.promocao = promocao;
    }

    public int getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(int codBarra) {
        this.codBarra = codBarra;
    }

    public int getQuantiProduto() {
        return quantiProduto;
    }

    public void setQuantiProduto(int quantiProduto) {
        this.quantiProduto = quantiProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

}
