import javax.swing.*;
import java.awt.*;

public class Calculadora1 extends JFrame {
    public Calculadora1() {
        JFrame janelaP = new JFrame();
        BorderLayout bord = new BorderLayout();
        JPanel painelV = new JPanel();
        JPanel painelV2 = new JPanel();
        JPanel painelB = new JPanel();
        janelaP.getContentPane().add(painelB,BorderLayout.CENTER);
        janelaP.getContentPane().add(painelV,BorderLayout.NORTH);
        janelaP.getContentPane().add(painelV2,BorderLayout.NORTH);
        GridLayout outro = new GridLayout(4, 4);
        painelB.setLayout(outro);
        JTextField caixa = new JTextField (25);
        JTextField caixa2 = new JTextField (25);
        painelV.add(caixa);
        painelV2.add(caixa2);
        String textBotoes[] = { "C", "9", "8", "7", "\u00f7", "6", "5", "4", "*", "3", "2", "1", "-", "+", "0", "=" };
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));

        }
        janelaP.setDefaultCloseOperation(2);
        janelaP.setVisible(true);
        janelaP.pack();


    }

}
