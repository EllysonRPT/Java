package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import Controll.Funcao;
import Model.Elevador;

public class Painel extends JFrame {
    Elevador elevador1 = new Elevador(0, 0, 0, 0);
    Elevador elevador2 = new Elevador(0, 0, 0, 0);

    public Painel() {
        super("Elevador");
        this.setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Adiciona BorderLayout ao JFrame
        setLayout(new BorderLayout());

        // Adiciona os botões ao centro usando GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(0, 1));
        for (int i = 6; i >= -2; i--) {
            JButton button = new JButton("" + i + "");
            centerPanel.add(button);
        }
        add(centerPanel, BorderLayout.CENTER);

        // Adiciona JLabels ao painel oeste e leste usando BoxLayout vertical
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        JLabel elevador1Label = new JLabel("Elevador 1");
        elevador1Label.setFont(elevador1Label.getFont().deriveFont(18.0f));
        westPanel.add(elevador1Label);

        JLabel andarLabel1 = new JLabel("Andar:" +  elevador1.getAndarAtual());
        andarLabel1.setFont(andarLabel1.getFont().deriveFont(18.0f));
        westPanel.add(andarLabel1);
        add(westPanel, BorderLayout.WEST);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
        JLabel elevador2Label = new JLabel("Elevador 2");
        elevador2Label.setFont(elevador2Label.getFont().deriveFont(18.0f));
        eastPanel.add(elevador2Label);

        JLabel andarLabel2 = new JLabel("Andar:"+elevador2.getAndarAtual());
        andarLabel2.setFont(andarLabel2.getFont().deriveFont(18.0f));
        eastPanel.add(andarLabel2);
        add(eastPanel, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Painel();
    }
}
