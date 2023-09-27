import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ex3 extends JFrame {

    public ex3() {

        super("Exercicio CardLayout");

        JPanel painel1 = new JPanel();// painel principal
        // add painel principal ao jFrame
        String intensCB[] = { "home", "login", "cadastro" };// intens dentro
        // criar botao
        JButton but1 = new JButton(intensCB[1]); // login
        JButton but2 = new JButton(intensCB[2]); // cadastro
        // JButton Bcadastro = new JButton(intensCB[2]);

        // painel de cards no padrão CL
        JPanel cards = new JPanel();
        // criar o objeto do cardLayout
        CardLayout cl = new CardLayout();

        cards.setLayout(cl);
        // add o botão e o cards ao painel principal
        painel1.add(but1);
        painel1.add(but2);
        // painel1.add(Bcadastro);

        painel1.add(cards);
        // criar 3 paineis de cards (home, login, cadastro)
        JPanel home = new JPanel();
        JPanel login = new JPanel();
        JPanel cadastro = new JPanel();
 
        
      

        // add os home, car2, cadastro ao cards
        cards.add(home, intensCB[0]);// add o card e atribuindo um "nome"
        cards.add(login, intensCB[1]);
        cards.add(cadastro, intensCB[2]);
        // diferenciando os cards
        
        JPanel pagH = new JPanel();
        JPanel pagL = new JPanel();
        pagL.add(new Label("USUARIO:" ));
        pagL.add(new Label("SENHA:"));
        JPanel pagC = new JPanel();
          
        login.add(pagL);

        home.add(new JLabel("BEM-VINDO"));
        login.add(new JLabel("LOGIN"));
        cadastro.add(new JLabel("CADASTRE-SE"));

        // funcionalidade do botao 1
        but1.addActionListener(e -> {
            if (but1.getText() == intensCB[0]) {
                cl.show(cards, "home");
                // JOptionPane.showMessageDialog(null, "home 1");
                but1.setText(intensCB[1]);
                but2.setText(intensCB[2]);
            } else if (but1.getText() == intensCB[1]) {
                cl.show(cards, "login");
                // JOptionPane.showMessageDialog(null, "login 1");
                but1.setText(intensCB[0]);
                but2.setText(intensCB[2]);
            } else {
                cl.show(cards, "cadastro");
                // JOptionPane.showMessageDialog(null, "cadastro 1");
                but1.setText(intensCB[0]);
                but2.setText(intensCB[1]);

            }
        });

        // funcionalidade do botao 2
        but2.addActionListener(e -> {
            if (but2.getText() == intensCB[0]) {
                cl.show(cards, "home");
                // JOptionPane.showMessageDialog(null, "home ");
                but1.setText(intensCB[1]);
                but2.setText(intensCB[2]);
            } else if (but2.getText() == intensCB[1]) {
                cl.show(cards, "login");
                // JOptionPane.showMessageDialog(null, "login ");
                but1.setText(intensCB[0]);
                but2.setText(intensCB[2]);
            } else {
                cl.show(cards, "cadastro");
                // JOptionPane.showMessageDialog(null, "cadastro ");
                but1.setText(intensCB[0]);
                but2.setText(intensCB[1]);

            }
        });

        this.add(painel1);
        // set frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

    }

}
