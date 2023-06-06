package ELEVADOR;

import javax.swing.JOptionPane;

public class Elevador {
    int capacidadeMax;
    int nMaxAndar;
    int andarAtual;
    int capacidadeAtual;
    //construtor=metofos
    public Elevador(int capacidadeMax, int nMaxAndar) {
        this.capacidadeMax = capacidadeMax;
        this.nMaxAndar = nMaxAndar;
        capacidadeAtual = 0;
        andarAtual=0;//predefinido
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    //metodos voids sem retorno
    //metodos return
    //metodos adicionais
    //entrar
public int entrar(){
    if (capacidadeAtual<capacidadeMax) {
        capacidadeAtual++;
    }else{
        JOptionPane.showInternalMessageDialog(null, "capacidade máxima \n Não vai subir ninguem");
    }
    return capacidadeAtual; 
}
public int sair(){
    if (capacidadeAtual>0) {
        capacidadeAtual--;
    }else{
        JOptionPane.showInternalMessageDialog(null, "nao há ninguem para sair");
    }
    return capacidadeAtual; 
}
//subir
public  void acao(int nAndares) {
    if (nAndares<=nMaxAndar && nAndares>=0 && nAndares!=andarAtual) {
        andarAtual=nAndares;
    }
    else {
        andarAtual = nMaxAndar;
            JOptionPane.showMessageDialog(null,"digite um andar valido");
    }
}
public void iniciar() {
    andarAtual=0;
    capacidadeAtual=0;
}
//descer
}
