import java.awt.*;

import javax.swing.*;

public class ex1 extends JFrame {
    public ex1(){
       this.setBounds(200, 200, 300, 400);
       this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
       FlowLayout caixa =new FlowLayout();
       
       this.setLayout(caixa);
       for (int i = 0; i <= 5; i++) {
        this.add(new JButton("APERTE " + i));
       
       }
        this.setVisible(true);//EXIBE JANELA
    }

    
    
}
