package Model;

public class Registro {
    private int ValorTotal;
    private String Vip;
    private String dinheiro;
    private String cartao;

    public Registro(int valorTotal, String vip, String dinheiro, String cartao) {
        ValorTotal = valorTotal;
        Vip = vip;
        this.dinheiro = dinheiro;
        this.cartao = cartao;
    }

    public Registro(String string, String string2, int int1) {
    }

    public int getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(int valorTotal) {
        ValorTotal = valorTotal;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String vip) {
        Vip = vip;
    }

    public String getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
}
