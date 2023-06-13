package BANCO;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        ContaPJ contasPj[] = new ContaPJ[10];
        ContaPF contasPf[] = new ContaPF[10];
        boolean aberta = true;
        int contPf = 0;
        int contPj = 0;
        int contaAtual = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "ESCOLHA A AÇÃO" +
                            "\n 1-ABRIR CONTA PF" +
                            "\n 2-ABRIR CONTA PJ" +
                            "\n 3-ACESSAR CONTA PF " +
                            "\n 4-ACESSAR CONTA PJ" +
                            "\n 5-SAIR"));

            if (acao == 1) {
                // abrir conta PF
                // criar conta
                // instanciar conta
                contasPf[contPf] = new ContaPF(); // objeto criado
                // preencher as informações da conta
                contasPf[contPf].setNome(JOptionPane.showInputDialog("INFORME O NOME"));
                contasPf[contPf].setnCPF(JOptionPane.showInputDialog("INFORME CPF"));
                contasPf[contPf].setSaldo(1000);
                contasPf[contPf].setnConta(1000 + contPf);
                contPf++;
            }
            if (acao == 2) {
                // abrir conta PJ
                // criar conta
                // instanciar conta
                contasPj[contPj] = new ContaPJ(); // objeto criado
                // preencher as informações da conta
                contasPj[contPj].setNome(JOptionPane.showInputDialog("INFORME O NOME"));
                contasPj[contPj].setnCNPJ(JOptionPane.showInputDialog("INFORME CPF"));
                contasPj[contPj].setSaldo(4000);
                contasPj[contPj].setnConta(2000 + contPj);
                contPj++;
            }

            else if (acao == 3) {// BUSCAR A CONTA JÁ CRIADA DA PF
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("INFORME O NUMERO DA CONTA BUSCADO"));
                for (int i = 0; i < contasPf.length; i++) {
                    // busca pelo n/conta
                    if (nContaBusca == contasPf[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "CONTA ENCONTRADA");
                        break;
                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("AÇÃO DESEJADA:"
                            + "\n 1- VERIFICAR SALDO"
                            + "\n 2- SAQUE "
                            + "\n 3- DEPOSITAR"
                            + "\n 4- EMPRÉSTIMO"
                            + "\n 5- SAIR DA CONTA"));
                    if (acao2 == 1) {
                        //jop
                        JOptionPane.showMessageDialog(null,"seu saldo é de "+contasPf[contaAtual].getSaldo());
                    } else if (acao2 == 2) {
                        contasPf[contaAtual].saque();
                    } else if (acao2 == 3) {
                        contasPf[contaAtual].depósito();
                    } else if (acao2 == 4) {
                        contasPf[contaAtual].empréstimo();
                    } else {
                        acessar=false;
                        // n/invalido
                    }

                }

            } else if (acao == 4) {// BUSCAR A CONTA JÁ CRIADA DA PJ
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("INFORME O NUMERO DA CONTA BUSCADO"));
                for (int i = 0; i < contasPj.length; i++) {
                    // busca pelo n/conta
                    if (nContaBusca == contasPj[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "CONTA ENCONTRADA");
                        break;
                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("AÇÃO DESEJADA:"
                            + "\n 1- VERIFICAR SALDO"
                            + "\n 1- SAQUE "
                            + "\n 1- DEPOSITAR"
                            + "\n 1- EMPRÉSTIMO"
                            + "\n 1- SAIR DA CONTA"));
                    if (acao2 == 1) {
                        contasPj[contaAtual].getSaldo();
                    } else if (acao2 == 2) {
                        contasPj[contaAtual].saque();
                    } else if (acao2 == 3) {
                        contasPj[contaAtual].depósito();
                    } else if (acao2 == 4) {
                        contasPj[contaAtual].empréstimo();
                    } else {
                        // n/invalido
                    }

                }
            }
           

        }
    }
}