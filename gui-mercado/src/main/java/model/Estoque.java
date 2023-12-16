package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Controller.EstoqueControl;

public class Estoque<Produtos> {

    // atributos
    private String codBarra;
    private String quantiProduto;
    private String nomeProduto;
    private String valor;

    //construtor

    public Estoque(String codBarra, String quantiProduto, String nomeProduto, String valor) {
        this.codBarra = codBarra;
        this.quantiProduto = quantiProduto;
        this.nomeProduto = nomeProduto;
        this.valor = valor;

    }

    //métodos get set
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

    public Collection<Estoque> listarProdutos() {
        return null;
    }

    

 
}