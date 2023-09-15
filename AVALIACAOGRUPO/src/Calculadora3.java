import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora3 extends JPanel {
    public Calculadora3(){
        super();
        JLabel titleLabel = new JLabel("Conversor ");
        JLabel titleLabel2 = new JLabel(" APENAS ");
        titleLabel2.setBackground(Color.RED);
        JLabel titleLabel3 = new JLabel("De Horas");
        
            this.setLayout(new GridBagLayout());
            JPanel painel = new JPanel();//
            //CRIAR PAINEL
            painel.add(titleLabel);
            painel.add(titleLabel2);
            painel.add(titleLabel3);
            //ADICIONA O TEXTO AO PAINEL
             
            //ADICIONA O PAINEL AO 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(30, 50, 30, 50);

        // JLabel titleLabel = new JLabel("Conversor de Horas");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel2.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel3.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0; //POSIÇÃO EM X DO TITULO
        gbc.gridy = 0; //POSIÇÃO EM Y DO TITULO
        gbc.gridwidth = 2;
       
        this.add(painel, gbc);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JTextField textFieldHora = new JTextField();
        JTextField textFieldMinuto = new JTextField();
        JTextField textFieldSegundo = new JTextField();
        textFieldSegundo.setEditable(true);
        
        
        panel.add(new JLabel(" Horas:")); //aqui estamos 
        panel.add(textFieldHora);
        panel.add(new JLabel(" Minutos:"));
        panel.add(textFieldMinuto);
        panel.add(new JLabel(" Segundos : "));
        panel.add(textFieldSegundo);

        gbc.gridx = 0; //POSIÇÃO EM X DO CAMPO
        gbc.gridy = 1; //POSIÇÃO EM Y DO CAMPO
        gbc.gridwidth = 4;
        this.add(panel, gbc);

    

  
     
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton converterButton = new JButton("Converter");
        converterButton.setFont(new Font("Arial", Font.BOLD, 12));
        
        converterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int horas = Integer.parseInt(textFieldHora.getText());
                    int minutos = 0;
                    if (!textFieldMinuto.getText().isEmpty()) {
                        minutos = Integer.parseInt(textFieldMinuto.getText());
                    }
                    int totalMinutos = horas * 60 + minutos;
                    int segundos = totalMinutos * 60;
                    textFieldMinuto.setText(String.valueOf(totalMinutos));
                    textFieldSegundo.setText(String.valueOf(segundos));
                } catch (NumberFormatException ex) {
                    textFieldMinuto.setText("Erro");
                    textFieldSegundo.setText("Erro");
                }
            }
        });

        JButton limparButton = new JButton("Limpar");
        limparButton.setFont(new Font("Arial", Font.BOLD, 12));
        //limparButton.setIcon(new ImageIcon("icon_limpar.png")); // Substitua "icon_limpar.png" pelo caminho do seu ícone
        limparButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //LIMPAR OS ESPACOS
                textFieldHora.setText("");
                textFieldMinuto.setText("");
                textFieldSegundo.setText("");
            }
        });

        buttonPanel.add(converterButton);
        buttonPanel.add(limparButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        this.add(buttonPanel, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Calculadora2");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Calculadora2());
                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}
