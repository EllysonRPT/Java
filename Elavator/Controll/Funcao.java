import javax.swing.JOptionPane;

import Model.Elevador;

public class Funcao {
    Elevador elevador1 = new Elevador(0, 0, 0, 0);

    public void Chamar() {
        boolean pergunta = true;
        while (pergunta) {
            int andarDesejado = Integer.parseInt(JOptionPane.showInputDialog( null,"informe o andar"));
            if (pergunta){
                if (elevador1.getAndarDesejado() >= -2 && elevador1.getAndarDesejado() <= 6) {
                    elevador1.setAndarDesejado((andarDesejado));
                    JOptionPane.showMessageDialog(null, "Elevador 1 está no andar " + elevador1.getAndarDesejado());
                } else {
                    JOptionPane.showInputDialog("ANDAR INVALIDO");
                }
            } else {
                pergunta = false;
            }
        }
    }

    public void Funcao() {

    }

}