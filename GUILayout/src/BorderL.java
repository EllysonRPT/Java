import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderL {
    public BorderL(){
         super();
        JFrame janela = new JFrame("my window");
        BorderLayout  bord  = new BorderLayout(); 
        janela.setLayout(bord);
       janela.add(new JButton("NORTH"), BorderLayout.NORTH);
       janela.add(new JButton("SOUTH"),BorderLayout.SOUTH);
       janela.add(new JButton("WEST"),BorderLayout.WEST);
       janela.add(new JButton("EAST"),BorderLayout.EAST);
       janela.add(new JButton("CENTER"),BorderLayout.CENTER);

        janela.setDefaultCloseOperation(2);
        janela.setVisible(true);
        janela.pack();

    }
}
