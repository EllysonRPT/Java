import javax.swing.*;
import java.awt.*;
public class button extends JFrame {
    int clickCont =0;
    public button() {
        super("calculadora");
        this.setBounds(200, 200, 400, 400);
        this.getDefaultCloseOperation();
         FlowLayout flow = new FlowLayout();
         this.setLayout(flow            );
    for (int i = 1; i <=16; i++) {
       JButton but = new JButton(""+i);
       but.setSize(90, 90);
       this.add(but);
    }
   
    // for (int i = 0; i <=4; i++) {
    //     JPanel painel = new JPanel();
    //     painel.setSize(400, 400);
    //     this.addset
    //     for (int j = 0; j < array.length; j++) {
        
    //     }
    // }
this.setVisible(true);
    }
}

