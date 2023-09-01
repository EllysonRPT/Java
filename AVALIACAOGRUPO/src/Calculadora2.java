import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Calculadora2 extends JPanel{
    public Calculadora2(){
        super();
        this.add(new JLabel("Calculadora 1"));
        BorderLayout border = new BorderLayout();
      this.setLayout(border);

      JPanel painel1 =new JPanel();
      JPanel painel2 =new JPanel();
      JPanel painel3 =new JPanel();
      JPanel painel4 =new JPanel();

      this.add(painel1,BorderLayout.CENTER);
      this.add(painel2,BorderLayout.NORTH);

      
      GridLayout outro = new GridLayout(4, 4);
      GridLayout outro1 = new GridLayout(2, 2);
      painel1.setLayout(outro);
      painel2.setLayout(outro1);
      painel2.add(painel3);
      painel3.add(new JLabel("REAL"));
      JTextField caixa1 = new JTextField (15);
      painel2.add(painel4);
      painel4.add(new JLabel("EURO"));
      JTextField caixa2 = new JTextField (15);
      painel2.add(caixa1);
      painel2.add(caixa2);
      

      String textBotoes[] = { "C","7", "8", "9",  "4", "5", "6","1","2",  "3" ,  "0", ",","=" };
      for (int i = 0; i < textBotoes.length; i++) {
          painel1.add(new JButton(textBotoes[i]));
        

      }
      
      this.setVisible(true);
      
      //ADICIONAR  ELEMENTOS AOS PAINEIS
    }
}
