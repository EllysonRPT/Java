package Tratamento;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex2 extends JFrame {
    public ex2() {
        JPanel mainPainel = new JPanel();
        this.add(mainPainel);
        JLabel texto = new JLabel("COMEÇE A DIGITAR");
        mainPainel.add(texto);
        JLabel texto2 = new JLabel();
        mainPainel.add(texto2);
        JTextField escre = new JTextField();
        mainPainel.add(escre);
        JLabel escre2 = new JLabel();
        mainPainel.add(escre2);

        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        this.setVisible(true);

        texto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char typedkey = e.getKeyChar();
                escre.setText(escre2.getText());
                texto2.setText(" "+typedkey);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }

        });

    }
}
