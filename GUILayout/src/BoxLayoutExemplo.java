import javax.swing.*;
import java.awt.*;

public class BoxLayoutExemplo extends JFrame {
    public BoxLayoutExemplo(){
        super("EXEMPLO : BOX LAYOUT");
      BorderLayout border = new BorderLayout();
      this.setLayout(border);
      //criar dois painel
      JPanel painel1 =new JPanel();
      JPanel painel2 =new JPanel();
      //adiicionar painel aos frame
      this.add(painel1,BorderLayout.WEST);
      this.add(painel2,BorderLayout.SOUTH);
      //layout dos paineis 
      painel2.setLayout(new BoxLayout(painel2, BoxLayout.Y_AXIS));
      painel2.setLayout(new BoxLayout(painel2, BoxLayout.Y_AXIS));
      //ADICIONAR  ELEMENTOS AOS PAINEIS
      for (int i = 0; i <5;  i++) {
        painel1.add(new JButton(""+(+i+1)));
        painel2.add(new JButton(""+(+i+1)));
      }
     this.setDefaultCloseOperation(2);
       this.setVisible(true);
       this.pack();

         
    }
}
