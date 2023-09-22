import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class exe extends JFrame {

    public exe() {

        super("Exercicio CardLayout"); 

        JPanel painel1 = new JPanel();// painel principal
        // elemento de seleção de JComboBox
        String intensCB[] = { "card 1", "card 2","card 3","card 5" };// intens dentro
        // JComboBox cd = new JComboBox<>(intensCB);// acao para os elementos
        // painel1.add(cd); // CAIXA DE MUDANÇA
        // criar card
        JPanel cards = new JPanel(); // card principal irá permitir a navegação
        CardLayout cl = new CardLayout(); //
        cards.setLayout(cl);
        //
        
        JButton but0 = new JButton("FIRST");//BOTAO DE ACAO PROXIMO
        painel1.add(but0);
       
        JButton but2 = new JButton("PREVIOUS");//BOTAO DE ACAO PROXIMO
        painel1.add(but2);
        
        JButton but = new JButton("NEXT"); //BOTAO DE ACAO PROXIMO
        painel1.add(but);

        JButton but3 = new JButton("LAST"); //BOTAO DE ACAO PROXIMO
        painel1.add(but3);
        
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botao 1"));
        card1.add(new JButton("Botao 2"));
        card1.add(new JButton("Botao 3"));
     
        JPanel card2 = new JPanel();
        card2.add(new JTextField("Card com Jtext"));
        // adicionando cards á pilha

         JPanel card3 = new JPanel();
        card1.add(new JButton("TEST 1"));
        card1.add(new JButton("NO 2"));
        card1.add(new JButton("FUNCTION 3"));
        card1.add(new JButton("SORRY 1"));
        card1.add(new JButton("Botao 2"));
        card1.add(new JButton("Botao 3"));

         JPanel card5 = new JPanel();
        card5.add(new JTextField("TEST"));
        card5.add(new JTextField("DOBLE"));
        // adicionando cards á pilha
        cards.add(card1, intensCB[0]);
        cards.add(card2, intensCB[1]);
        cards.add(card3, intensCB[2]);
        cards.add(card5, intensCB[3]);
        painel1.add(cards);
        this.add(painel1);
        // set frame
        
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        // ação para o comboBox
        but0.addActionListener(e -> {
            cl.first(cards);         

        });
        but3.addActionListener(e -> {
            cl.last(cards);        

        });
        but.addActionListener(e -> {
            cl.next(cards);         

        });
        but2.addActionListener(e -> {
            cl.previous(cards);        

        });

    }

}
