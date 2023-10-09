package Tratamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class exemploNome extends JFrame {

    public JTextField caixa1;
    public JTextField caixa2;
    public JLabel texto;

    public exemploNome() {
        super("Nome Sobrenome");
        JPanel mainPainel = new JPanel(new GridLayout(3, 2));
        this.add(mainPainel);
        mainPainel.add(new JLabel("Nome"));
        caixa1 = new JTextField();
        mainPainel.add(caixa1);
        mainPainel.add(new JLabel("SobreNome"));
        caixa2 = new JTextField();
        mainPainel.add(caixa2);
        JButton botao = new JButton("concatenar");
        mainPainel.add(botao);
        texto = new JLabel();
        mainPainel.add(texto);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        this.setVisible(true);
        // //tratamento do evento
        // botao.addActionListener(e->{
        // // contatenar o texto das caixas
        // texto.setText(caixa1.getText()+" "+caixa2.getText());
        // // apagar o texto das caixa
        // caixa1.setText(" ");
        // caixa2.setText(" ");
        // });

        // botao.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // // concaterna o texto das caixas
        // texto.setText(caixa1.getText() + " " + caixa2.getText());
        // // apagar o texto das Caixas
        // caixa1.setText("");
        // caixa2.setText("");
        // }

        // });
        // chamando o handler
        handler evento = new handler();
        botao.addActionListener(evento);

    }

    public class handler implements ActionListener {

        
        @Override
        public void actionPerformed(ActionEvent e) {

            // concaterna o texto das caixas
            texto.setText(caixa1.getText() + " " + caixa2.getText());
            // apagar o texto das Caixas
            caixa1.setText("");
            caixa2.setText("");

        }
    }
}