package EXCEPTION;

import javax.swing.JOptionPane;

public class ExemploThrow {
  public static void main(String[] args) {
    String senhaDigitada = JOptionPane.showInputDialog(null, "INFORME UMA SENHA DE 6 DÍGITOS");

    boolean aberta = true;
    while (aberta) {
      try {
        if (senhaDigitada.length() != 6) {
          throw new Exception("senha invalida");
        }
        aberta = false;
      }

      catch (Exception e) {
        JOptionPane.showInputDialog(null, e.getMessage());
      }

    }

  }
}
