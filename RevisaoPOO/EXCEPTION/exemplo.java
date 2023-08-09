package EXCEPTION;

import javax.swing.JOptionPane;

public class exemplo {
    public static void main(String[] args) {

        boolean fechada = true;
        while (fechada) {
            String usuarioDigitada = JOptionPane.showInputDialog(null, "DIGITE O USUARIO");
            String dataNascimento = JOptionPane.showInputDialog(null, "DD/MM/AA");
            String senhaDigitada = JOptionPane.showInputDialog(null, "DIGITE UMA SENHA");
            dataNascimento=dataNascimento.replace("/", "");
            try {
                if (dataNascimento.equals(senhaDigitada)) {
                throw new Exception("A DATA É IGUAL AO USUARIO");
            }
                if (usuarioDigitada == senhaDigitada || usuarioDigitada.equals(senhaDigitada)) {
                    throw new Exception("A SENHA É IGUAL AO USUARIO");
                }
                if (senhaDigitada.length() != 8) {
                    throw new Exception("SENHA DEVE SER MAIOR QUE 6");
                  }
                  else{
                    JOptionPane.showMessageDialog(null, "logado sei lá");
                  }
                fechada = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                // TODO: handle exception

            }
        }

    }

}
