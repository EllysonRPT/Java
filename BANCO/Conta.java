package BANCO;

import javax.swing.JOptionPane;

public abstract class Conta {
    public String nome;
    public int nConta;
    public double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque() {
        int saque = Integer.parseInt(JOptionPane.showInputDialog("INFORM O VALOR QUE DESEJA SACAR"));
        if (saque < saldo) {
            saldo -= saque;
            JOptionPane.showMessageDialog(null, "SAQUE REALIZADO,SEU SALDO  É DE" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
        }
    }

    public void depósito() {
        int depositar = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR QUE DESEJA DEPOSITAR"));
        if (depositar>0) {
            saldo += depositar;
            JOptionPane.showMessageDialog(null, "SAQUE REALIZADO,SEU SALDO  É DE" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "NENHUM VALOR Á DEPOSITAR");
        }
    }

    public void empréstimo() {
        int empréstimo = Integer.parseInt(JOptionPane.showInputDialog("QUAL O VALOR DO EMPRÉSTIMO?"));
        if (empréstimo < 500 && empréstimo>0) {
            saldo += empréstimo;
            JOptionPane.showMessageDialog(null, "EMPRÉSTIMO REALIZADO,SEU SALDO  É DE" + saldo);
        } 
        else {
            JOptionPane.showMessageDialog(null, "O VALOR DO EMPRESÉTIMO DEVE SER DE 1R$ Á 500R$");
        }
    }
}
