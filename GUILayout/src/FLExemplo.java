import javax.swing.*;
import java.awt.*;

public class FLExemplo {
    public FLExemplo(){
        JFrame frame =new JFrame("JANELA");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      JPanel c = new JPanel();
      c.add(new JButton("1"));
      c.add(new JTextField(9));
      c.add(new JButton("DOIS"));
      c.add(new JButton("TRES"));
      JButton but = new JButton();
      frame.getContentPane().add(c);
      frame.setVisible(true);
      frame.pack();


    }
}
