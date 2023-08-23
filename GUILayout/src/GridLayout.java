import javax.swing.*;
import java.awt.*;

public class GridLayout {

    public GridLayout() {
        JPanel jpanel = new JPanel(new BorderLayout());
        JButton b = new JButton("Botão");
        jpanel.add(b, BorderLayout.CENTER);
        JFrame frame = new JFrame();
        frame.getContentPane().add(jpanel);
        frame.pack();
        frame.setVisible(true);
    }
}
