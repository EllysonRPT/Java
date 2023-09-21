import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();
        this.add(new JLabel("Calculadora 2"));
        BorderLayout border = new BorderLayout(); // CRIAR BORDER LAYOUT
        this.setLayout(border); // SETANDO LAYOUT
    
        var painel1 = new JPanel(); // PAINEL DE NUMEROS
        JPanel painel2 = new JPanel();// PAINEL CAIXA
        JPanel painel3 = new JPanel();// PAINEL LABEL
        JPanel painel4 = new JPanel();// PAINEL CAIXA
        JPanel painel5 = new JPanel();// PAINEL LABEL
        //SETANDO CORES
    painel3.setBackground(Color.decode("#8d9d9e"));
    painel5.setBackground(Color.decode("#8d9d9e"));
    
      

        painel3.setLayout(new java.awt.GridBagLayout());

        this.add(painel1, BorderLayout.CENTER); // POSICIONAMENTO DO PAINEL
        this.add(painel2, BorderLayout.NORTH); // POSICIONAMENTO DO PAINEL
        this.add(painel4, BorderLayout.SOUTH); // POSICIONAMENTO DO PAINEL

        GridLayout outro = new GridLayout(4, 5, 4, 4); // TAMANHO E ESPA;AMENTO DE NUMEROS
        GridLayout outro1 = new GridLayout(1, 1,1,1); // TAMANHO DA CAIXA DE NUMEROS
        painel1.setLayout(outro);// NUMEROS
        painel2.setLayout(outro1);//  TAMANHO DE CAIXA  SETADA
        painel4.setLayout(outro1);// TAMANHO DE CAIXA 2 SETADA
        painel2.add(painel3); // LABEL 1
        painel4.add(painel5); // LABEL 2

        JLabel la = new JLabel("EURO"); // LABEL CRIADA
        la.setFont(new Font("Arial", Font.BOLD, 20)); // FONTE E TAMANHO CONFIGUARDO
        painel3.add(la); // LABEL ADICIONADA AO PAINEL

        JLabel la2 = new JLabel("DÓLAR"); // LABEL CRIADA
        la2.setFont(new Font("Arial", Font.BOLD, 20)); // FONTE E TAMANHO CONFIGUARDO
        painel5.add(la2); // LABEL ADICIONADA AO PAINEL

        JTextField caixa1 = new JTextField(15); // CAMPO DE ESCREVER CRIADO
        caixa1.setFont(new Font("Serif", Font.PLAIN, 26)); //FONTE E TAMANHO
        painel2.add(caixa1); //CAMPO ADCIONADO

        JTextField caixa2 = new JTextField(15); // CAMPO DE ESCREVER CRIADO
        caixa2.setFont(new Font("Serif", Font.PLAIN, 26)); //FONTE E TAMANHO
        painel4.add(caixa2); //CAMPO ADCIONADO

        
        caixa1.setBackground(Color.decode("#74B4CF"));
        caixa2.setBackground(Color.decode("#74B4CF"));

        // CRIAR BOTÕES
        JButton igual = new JButton("=");
        JButton sete = new JButton("7");
        JButton oit = new JButton("8");
        JButton nov = new JButton("9");
        JButton qua = new JButton("4");
        JButton cin = new JButton("5");
        JButton se = new JButton("6");
        JButton um = new JButton("1");
        JButton dois = new JButton("2");
        JButton tre = new JButton("3");
        JButton zero = new JButton("0");
        JButton vir = new JButton(",");

        // ADICIONAR BOTÕES AO PAINEL
        painel1.add(sete);
        painel1.add(oit);
        painel1.add(nov);
        painel1.add(qua);
        painel1.add(cin);
        painel1.add(se);
        painel1.add(um);
        painel1.add(dois);
        painel1.add(tre);
        painel1.add(zero);
        painel1.add(vir);
        painel1.add(igual);

        // ADICIONAR AÇÃO AOS BOTÕES
        um.addActionListener(i -> {
            String textIni = caixa1.getText();
            caixa1.setText(textIni + 1);
        });

    }

}
