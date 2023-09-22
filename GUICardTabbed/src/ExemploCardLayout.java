import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ExemploCardLayout extends JFrame {
    // cinstrutor
    public ExemploCardLayout() {
        super("Exemplo CardLayout");
        JPanel painel1 = new JPanel();//painel principal
        //elemento de seleção de JComboBox
        String intensCB[]= {"card 1" , "card 2"};//intens dentro
        JComboBox cd = new JComboBox<>(intensCB);//acao para os elementos
        painel1.add(cd);
        //criar card 
        JPanel cards = new JPanel(); // card principal irá permitir a navegação
        CardLayout cl = new CardLayout(); //
        cards.setLayout(cl);
        //
        JPanel card1  = new JPanel();
        card1.add(new JButton("Botao 1") );
        card1.add(new JButton("Botao 2") );
        card1.add(new JButton("Botao 3") );

        JPanel card2 =new JPanel();
        card2.add(new JTextField("Card com Jtext"));
        //adicionando cards á pilha
        cards.add(card1,"card1");
        cards.add(card2,intensCB[1]);
        painel1.add(cards);
        this.add(painel1);
        //set frame 
        this.setDefaultCloseOperation(2);
        this.setBounds(100,100,300,300);
        this.setVisible(true);
       //ação para o comboBox
       cd.addItemListener(e->{
      cl.show(cards,(String)e.getItem());

       });
       
    }
}
