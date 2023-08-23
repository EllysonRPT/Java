import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Container extends JFrame {
    public Container() {
        this.setBounds(50, 100, 400, 150);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        FlowLayout flow = new FlowLayout();//DEFINE O LAYOUT DO CONTAINER
        this.setLayout(flow);//SETA LAYOUT DO CONTAINER
        for (int i = 1; i <= 5; i++) {
            this.add(new JButton("APERTE" + i));
           
        }
    }
}
