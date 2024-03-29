import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculadora1 extends JPanel {
    public Calculadora1() {
        super();
        this.add(new JLabel("Calculadora 1"));
        BorderLayout border = new BorderLayout();
        this.setLayout(border);

        var painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        painel3.setLayout(new java.awt.GridBagLayout());

        // POSICIONAMENTO DO PAINEL
        this.add(painel1, BorderLayout.CENTER);
        this.add(painel2, BorderLayout.NORTH);

        painel3.setBackground(Color.gray);
        painel1.setBackground(Color.lightGray);

        GridLayout outro = new GridLayout(5, 5, 4, 4);
        GridLayout outro1 = new GridLayout(1, 1);
        painel1.setLayout(outro);
        painel2.setLayout(outro1);
        painel2.add(painel3);
        JLabel la = new JLabel("INSERIR VALOR"); // LABEL CRIADA
        la.setFont(new Font("Arial", Font.BOLD, 20));  // FONTE E TAMANHO CONFIGUARDO
        painel3.add(la); // LABEL ADICIONADA AO PAINEL

        

        JTextField caixa1 = new JTextField(15);
        caixa1.setFont(new Font("Serif", Font.PLAIN, 26));
        caixa1.setBackground(Color.decode("#8d9d9e"));
        painel2.add(caixa1); 

         // CRIAR BOTÕES
        
        JButton C = new JButton("C");
        JButton p = new JButton("()");
        JButton por = new JButton("%");
        JButton div = new JButton("\u00f7");
        JButton sete = new JButton("7");
        JButton oit = new JButton("8");
        JButton nov = new JButton("9");
        JButton mult = new JButton("*");
        JButton qua = new JButton("4");
        JButton cin = new JButton("5");
        JButton se = new JButton("6");
        JButton men = new JButton("-");
        JButton um = new JButton("1");
        JButton dois = new JButton("2");
        JButton tre = new JButton("3");
        JButton mais = new JButton("+");
        JButton maimen = new JButton("+/-");
        JButton zero = new JButton("0");
        JButton vir = new JButton(",");
        JButton igual = new JButton("=");

        // ADICIONAR BOTÕES AO PAINEL
        painel1.add(C);
        painel1.add(p);
        painel1.add(por);
        painel1.add(div);
        painel1.add(sete);
        painel1.add(oit);
        painel1.add(nov);
        painel1.add(mult);
        painel1.add(qua);
        painel1.add(cin);
        painel1.add(se);
        painel1.add(men);
        painel1.add(um);
        painel1.add(dois);
        painel1.add(tre);
        painel1.add(mais);
        painel1.add(maimen);
        painel1.add(zero);
        painel1.add(vir);
        painel1.add(igual);

        // ADICIONAR AÇÃO AOS BOTÕES
        C.addActionListener(i -> {
            caixa1.setText("");

        });
        um.addActionListener(i -> {
            String textIni = caixa1.getText();
            caixa1.setText(textIni + 1);
        });

    }

}
