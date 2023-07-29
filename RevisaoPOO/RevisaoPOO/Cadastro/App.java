package RevisaoPOO.Cadastro;

import javax.swing.JOptionPane;

public class App {
      public static void main(String[] args) {
            // vetores criar conta
            cachorro contaCachorro[] = new cachorro[10];
            outros contaOutros[] = new outros[10];
            gato contaGato[] = new gato[10];
            boolean aberta = true;
            int contcachorro = 0;
            int contGato = 0;
            int contOutros = 0;
            // abrindo laço de repetição
            JOptionPane.showMessageDialog(null, "BEM-VINDO AO COLSUTORIO\n DO DR.FRANKSTEIN");
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
                                                      "\n 2-CADASTRAR OUTROS" +
                                                      "\n 3-CADASTRAR GATO" +
                                                      "\n 4-SAIR"));
                              if (acao2 == 1) {
                                    contaCachorro[contcachorro] = new cachorro(null, acao2, null, null);
                                    contaCachorro[contcachorro]
                                                .setNome(JOptionPane.showInputDialog("INFORME O NOME DO ANIMAL"));
                                    contaCachorro[contcachorro].setPeso(Integer
                                                .parseInt(JOptionPane.showInputDialog("INFORME O PESO DO ANIMAL")));
                                    contaCachorro[contcachorro]
                                                .setEspecie(JOptionPane.showInputDialog("INFORME A RACA DO ANIMAL"));
                                    contaCachorro[contcachorro].setProprietario(
                                                JOptionPane.showInputDialog("INFORME O NOME DONO DO ANIMAL"));
                                    contcachorro++;
                              } else if (acao2 == 2) {
                                    contaGato[contGato] = new gato(null, acao2, null, null);
                                    contaGato[contGato]
                                                .setNome(JOptionPane.showInputDialog("INFORME O NOME DO ANIMAL"));
                                    contaGato[contGato].setPeso(Integer
                                                .parseInt(JOptionPane.showInputDialog("INFORME O PESO DO ANIMAL")));
                                    contaGato[contGato]
                                                .setEspecie(JOptionPane.showInputDialog("INFORME A RACA DO ANIMAL"));
                                    contaGato[contGato].setProprietario(
                                                JOptionPane.showInputDialog("INFORME O NOME DONO DO ANIMAL"));
                                    contGato++;

                              } else if (acao2 == 3) {
                                    contaOutros[contOutros] = new outros(null, acao2, null, null);
                                    contaOutros[contOutros]
                                                .setNome(JOptionPane.showInputDialog("INFORME O NOME DO ANIMAL"));
                                    contaOutros[contOutros].setPeso(Integer
                                                .parseInt(JOptionPane.showInputDialog("INFORME O PESO DO ANIMAL")));
                                    contaOutros[contOutros]
                                                .setEspecie(JOptionPane.showInputDialog("INFORME A RACA DO ANIMAL"));
                                    contaOutros[contOutros].setProprietario(
                                                JOptionPane.showInputDialog("INFORME O NOME DONO DO ANIMAL"));
                                    contOutros++;

                              } else if (acao2 == 4) {
                                    escolher = false;
                              } else {

                              }
                        }

                  }
                  else if (acao == 2) {
                        // a gendar consulta
                   
                  }
                  else if (acao == 3) {
                        aberta = false; // a gendar consulta

                  }
                  else {
                        JOptionPane.showMessageDialog(null, "INFORME O NUMERO 1,2 OU 3");

                  }
            }
      }

      private static void setNome(String showInputDialog) {
      }
}
