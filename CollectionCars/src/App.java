

import java.util.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //CADASTRAR NOVO CARRO
        //CONSULTAR CARRO
        //EXCLUIR CARRO DA MINHA LISTA
        String consulta ="";
        int Ncar =0;
        List <Carros> car = new ArrayList<>(); 
        boolean aberta = true;
        while (aberta) {
          int acao=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA ACAO \n"+"1-CADASTRAR NOVO CARRO \n"+"2-CONSULTAR CARRO \n"+"3-CONSUTA DETALHADA \n"+"4-SAIR"));
            if (acao==1) {
                //prencher as informaçoes
            Carros c = new Carros(JOptionPane.showInputDialog("INFORME A MARCA DO CARRO"),JOptionPane.showInputDialog("INFORME A ANO DO CARRO"),JOptionPane.showInputDialog("INFORME A MODELO DO CARRO"),JOptionPane.showInputDialog("INFORME A COR DO CARRO"));
               car.add(c);
            }else if (acao==2) {
                int i=0;
                  for (Carros a : car) {
                    
                    consulta+=a.imprimirLN();
                    i++;
                }
                JOptionPane.showMessageDialog(null,consulta);
                consulta=" ";
            }
            
            else if (acao==3) {
                int i=0;
                  for (Carros a : car) {
                    
                    consulta+=i+a.getMarca()+"  "+a.getModelo()+"\n ";
                    i++;
                }
               int acao2 = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A NUMERO DO CARRO"+consulta));
                JOptionPane.showMessageDialog(null,car.get(acao2));
                
               
            }else if (acao==4) {
                 int i=0;
                  for (Carros a : car) {
                    
                    consulta+=i+a.getMarca()+"  "+a.getModelo()+"\n ";
                    i++;
                }
               int acao2 = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A NUMERO DO CARRO"+consulta));
                JOptionPane.showMessageDialog(null,car.get(acao2));
                car.remove(acao2);

            }else{
                aberta=false;
            }
        }
    }

}