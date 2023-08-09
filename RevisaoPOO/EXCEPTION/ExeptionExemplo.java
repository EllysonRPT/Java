package EXCEPTION;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExeptionExemplo {
    public static void main(String[] args) {
       
        boolean aberta = true;
        while (aberta) {
            try {
                 int text = Integer.parseInt(JOptionPane.showInputDialog("DIGITE QUAL OPERAÇÃO DESEJA USAR"+ 
      "\n 1-SOMA"+ "\n 2-SUBTRAÇÃO" +"\n 3-MULTIPLICAÇÃO"+"\n 4-DIVISÃO"+"\n 5-SAIR"));
             if (text==1) {
                 int numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO"));
                JOptionPane.showMessageDialog(null, "o resultado é " + (numero1 + numero2));
                  aberta =false;
             }
              else if (text==2) {
                 int numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO"));
                JOptionPane.showMessageDialog(null, "o resultado é " + (numero1 - numero2));
                  aberta =false;
              } else if (text==3) {
                 int numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO"));
                JOptionPane.showMessageDialog(null, "o resultado é " + (numero1 * numero2));
                  aberta =false;
              }
              else if (text==4) {
                 int numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO"));
                JOptionPane.showMessageDialog(null, "o resultado é " + (numero1 / numero2));
                  aberta =false;
              }
              else{
                 aberta =false;
              }
            } catch (NumberFormatException erro1) {
                JOptionPane.showMessageDialog(null, erro1.getMessage());
            }catch (ArithmeticException erro2) {
                JOptionPane.showMessageDialog(null, erro2.getMessage());
            }
            catch (Exception erro3) {
                JOptionPane.showMessageDialog(null, "o valor digitado n é um inteiro  " +
                        "\ndigite novamente");
            }
        }
    }
}
