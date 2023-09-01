import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        super("Calculadoras");
        this.add(new Tabela());
        //set frame
        this.setBounds(500, 250, 500, 500);
        this.setVisible(true);
    }
}
