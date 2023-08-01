package RevisaoPOO.Cadastro;

import javax.swing.JOptionPane;

import RevisaoPOO.Cadastro.AGENDA.agenda;

public class App {
      /**
       * @param args
       */
      public static void main(String[] args) {
            // vetores criar conta
            agenda pAgenda[] = new agenda[10];//AMARZENAR AGENDA
            cachorro contaCachorro[] = new cachorro[10];
            outros contaOutros[] = new outros[10];
            gato contaGato[] = new gato[10];
            boolean aberta = true;
            int contcachorro = 0;
            int contGato = 0;
            int contOutros = 0;
            int contAgenda = 0;
            int RA = 1000;
            

            // abrindo laço de repetição
            JOptionPane.showMessageDialog(null, "BEM-VINDO AO COLSUTORIO\n DO DR.FRANKSTEIN");
            while (aberta) {
                  boolean escolher = true;
                  int acao = Integer.parseInt(JOptionPane.showInputDialog(
                              "ESCOLHA A AÇÃO" +
                                          "\n 1-CADASTRAR CONTA PET" +
                                          "\n 2-AGENDAR  PET" +
                                          "\n 3-SAIR"));
                  // cadastrar conta
                  if (acao == 1) {

                        // while (escolher) {
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
                              // CONTADOR +1
                              contcachorro++;
                              contcachorro = +RA;
                              JOptionPane.showInputDialog("SEU RA É" + RA);
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
                              contGato = +RA;
                              JOptionPane.showInputDialog("SEU RA É" + RA);

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
                              contOutros = +RA;
                              JOptionPane.showInputDialog("SEU RA É" + RA);

                        } else if (acao2 == 4) {
                              escolher = false;
                        } else {

                        }
                        // }

                  } else if (acao == 2) {
                        // // a gendar consulta
                        // int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                        //             "ESCOLHA A AÇÃO" +
                        //                         "\n 1-AGENDAR CACHORRO" +
                        //                         "\n 2-AGENDAR OUTROS" +
                        //                         "\n 3-AGENDAR GATO" +
                        //                         "\n 4-SAIR"));
                        // if (acao2 == 1) {
                        //      int RA Integer.parseInt(JOptionPane.showInputDialog("DIGITE O RA DO PET"));               
                        // }
                        boolean cadastraOk=false;
                        int nomeAgenda = Integer.parseInt(JOptionPane.showInputDialog("informe nome pet"));
                        for (int i = 0; i < contaCachorro.length; i++) {
                              if (contaCachorro[i].getNome().equals(nomeAgenda)) {
                                    JOptionPane.showInputDialog("pet encontrado");
                                    break;
                              }
                        }


                       
                        for (int i = 0; i < contaGato.length; i++) {
                              if (contaGato[i].getNome().equals(nomeAgenda)) {
                                    JOptionPane.showInputDialog("pet encontrado");
                                    break;
                              }
                        }


                       
                        for (int i = 0; i < contaOutros.length; i++) {
                              if (contaOutros[i].getNome().equals(nomeAgenda)) {
                                    JOptionPane.showInputDialog("pet encontrado");
                                    break;
                              }
                        }
                        if (cadastraOk) {
                              boolean agendar =true;
                              while (agendar) {
                                    String dataAgenda=JOptionPane.showInputDialog("informe data agenda");
                                    String horaAgenda=JOptionPane.showInputDialog("informe hora agenda");
                                    if(contAgenda==0){
                                         pAgenda[contAgenda]= new agenda();
                                         pAgenda[contAgenda].setData(dataAgenda);
                                         pAgenda[contAgenda].setHora(horaAgenda);
                                    }
                                    else{
                                          for (int i = 0; i < contaGato.length; i++) {
                                                
                                          }
                                    }
                              }
                        }









                  } else if (acao == 3) {
                        aberta = false; // a gendar consulta

                  } else {
                        JOptionPane.showMessageDialog(null, "INFORME O NUMERO 1,2 OU 3");

                  }
            }
      }

      private static void setNome(String showInputDialog) {
      }
}
