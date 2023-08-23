import javax.swing.JOptionPane;

public class JOptionSwing extends JOptionPane {
public JOptionSwing () {
    String informacao = "minha janela option";
    JOptionPane.showMessageDialog(getComponentPopupMenu(), informacao, informacao,JOptionPane.INFORMATION_MESSAGE );
}

}
