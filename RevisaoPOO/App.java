package RevisaoPOO;

import javax.swing.JOptionPane;

import RevisaoPOO.Cadastro.cachorro;
import RevisaoPOO.Cadastro.passaro;
import RevisaoPOO.Cadastro.peixe;

public class App {
      public static void main(String[] args) {
            // vetores
            cachorro contaCachorro[] = new cachorro[10];
            passaro contaPassaro[] = new passaro[10];
            peixe contaPeixe[] = new peixe[10];
            boolean aberta = true;
            int contcachorro = 0;
            int contpeixe = 0;
            int contpassaro = 0;
            // abrindo laço de repetição
            while (aberta) {
                  boolean escolher = true;
                  int acao = Integer.parseInt(JOptionPane.showInputDialog(
                              "ESCOLHA A AÇÃO" +
                                          "\n 1-CADASTRAR CONTA PET" +
                                          "\n 2-ACESSAR CONTA PET" +
                                          "\n 3-SAIR"));
                  // cadastrar conta
                  if (acao == 1) {

                        while (escolher) {
                              int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                          "ESCOLHA A AÇÃO" +
                                                      "\n 1-CADASTRAR CACHORRO" +
                                                      "\n 2-CADASTRAR PASSARO" +
                                                      "\n 3-CADASTRAR PEIXE" +
                                                      "\n 4-SAIR"));
                              if (acao2 == 1) {
                                    contaCachorro[contcachorro]
                                                .setNome(JOptionPane.showInputDialog("INFORME O NOME DO ANIMAL"));
                                    contaCachorro[contcachorro].setPeso(Integer
                                                .parseInt(JOptionPane.showInputDialog("INFORME O PESO DO ANIMAL")));
                                    contaCachorro[contcachorro]
                                                .setEspecie(JOptionPane.showInputDialog("INFORME A ESPÉCIE DO ANIMAL"));
                                    contaCachorro[contcachorro].setProprietario(
                                                JOptionPane.showInputDialog("INFORME O NOME DONO DO ANIMAL"));

                              }
                              else if (acao2 == 2) {
                                    contaCachorro[contcachorro]
                                                .setNome(JOptionPane.showInputDialog("INFORME O NOME DO ANIMAL"));
                                    contaCachorro[contcachorro].setPeso(Integer
                                                .parseInt(JOptionPane.showInputDialog("INFORME O PESO DO ANIMAL")));
                                    contaCachorro[contcachorro]
                                                .setEspecie(JOptionPane.showInputDialog("INFORME A ESPÉCIE DO ANIMAL"));
                                    contaCachorro[contcachorro].setProprietario(
                                                JOptionPane.showInputDialog("INFORME O NOME DONO DO ANIMAL"));

                              }
                              else if (acao2 == 3) {
                                    contaCachorro[contcachorro]
                                                .setNome(JOptionPane.showInputDialog("INFORME O NOME DO ANIMAL"));
                                    contaCachorro[contcachorro].setPeso(Integer
                                                .parseInt(JOptionPane.showInputDialog("INFORME O PESO DO ANIMAL")));
                                    contaCachorro[contcachorro]
                                                .setEspecie(JOptionPane.showInputDialog("INFORME A ESPÉCIE DO ANIMAL"));
                                    contaCachorro[contcachorro].setProprietario(
                                                JOptionPane.showInputDialog("INFORME O NOME DONO DO ANIMAL"));

                              }
                              else if (acao2==4) {
                                    escolher=false;
                              }
                              else{
                                    
                              }
                        }
                  }

            }

      }
}
