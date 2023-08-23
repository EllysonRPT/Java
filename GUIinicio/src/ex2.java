import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ex2 extends JFrame {
    int clickCont = 0;

    public ex2() {
        super("TESTANDO 123");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(300, 300);
        
        JButton but = new JButton("I AM A SWING BUTTON ");
        JPanel painel = new JPanel();
        painel.add(but);
        this.getContentPane().add(painel);
        this.setVisible(true);
        FlowLayout caixa = new FlowLayout();
        this.setLayout(caixa);
        but.addActionListener(i -> {
            
            this.getContentPane().add(painel);
            this.setVisible(true);
            this.add(new Button("BOTAO"));
            // but.addActionListener(j ->{

            // this.setVisible(true);
            // });
            // this.add(new JButton("APERTE"));

        });
    }
}
