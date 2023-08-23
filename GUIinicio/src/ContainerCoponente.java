import javax.swing.*;
import java.awt.*;
public class ContainerCoponente extends JFrame {
    int clickCont=0;
    public ContainerCoponente() {
        super("TA DANDO ERRO");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JButton but = new JButton("I AM A SWING BUTTON ");
       
        JLabel texto = new JLabel("NUMBER OF  BUTTON CLICK");
         JButton but2 = new JButton("I AM A SWING BUTTON ");
        JPanel painel = new JPanel();
        painel.add(but); 
        painel.add(but2); 
        painel.add(texto); 
        this.getContentPane().add(painel);
        this.pack();
        this.setVisible(true);
        but2.addActionListener(i ->{
        clickCont--;
         texto.setText("NUMBER OF  BUTTON CLICK " + clickCont);
        });
        but.addActionListener(i ->{
        clickCont++;
        texto.setText("NUMBER OF  BUTTON CLICK " + clickCont);
        });
     }

    
}
