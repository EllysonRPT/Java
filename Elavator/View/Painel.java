package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame {

    public Painel() {
        super("Elevador");
        this.setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Adiciona BorderLayout ao JFrame
        setLayout(new BorderLayout());

        // Adiciona os botões ao centro usando GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(4, 2));
        for (int i = 6; i >= -2; i--) {
            centerPanel.add(new JButton("" + i + ""));
        }
        add(centerPanel, BorderLayout.CENTER);

        // Adiciona JLabels ao norte
        JPanel northPanel = new JPanel(new GridLayout(1, 2));
        northPanel.add(new JLabel("Elevador"));
        northPanel.add(new JLabel("Andar"));
        add(northPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Painel();
    }
}
