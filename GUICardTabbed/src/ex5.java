import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ex5 extends JFrame {
    int pontuacao = 0;

    public ex5() {

        super("Exercicio CardLayout");
        CardLayout cl = new CardLayout();
        JPanel cardsPanel = new JPanel(cl);// painel principal
        JPanel cInicio = new JPanel();
        // String intensCB[] = { "start", "avançar" };// criando botao:
        cInicio.add(new JLabel("SEJA BEM-VINDO"));
        JButton start = new JButton("START");
        cardsPanel.add(cInicio);
        cInicio.add(start);

        JPanel pergunta1 = new JPanel();
        pergunta1.add(new JLabel("QUEM JOGOU NA COPA DE 1970"));
        JButton but1 = new JButton("AVANÇAR");
        JTextField respota1 = new JTextField(25);
        pergunta1.add(respota1);
        cardsPanel.add(pergunta1);
        pergunta1.add(but1);

        JPanel pergunta2 = new JPanel();
        pergunta2.add(new JLabel("QUANDO OCORREU A COPA DE 1970"));
        JButton but2 = new JButton("AVANÇAR");
        JTextField respota2 = new JTextField(25);
        pergunta2.add(respota2);
        cardsPanel.add(pergunta2);
        pergunta2.add(but2);

        JPanel pergunta3 = new JPanel();
        pergunta3.add(new JLabel("QUEM FOI CAMPEÃO NA COPA DE 1970"));
        JButton but3 = new JButton("AVANÇAR");
        JTextField respota3 = new JTextField(25);
        pergunta3.add(respota3);
        cardsPanel.add(pergunta3);
        pergunta3.add(but3);

        JPanel pergunta4 = new JPanel();
        pergunta4.add(new JLabel("OS TRÊS MELHORES  NA COPA DE 1970"));
        JButton but4 = new JButton("AVANÇAR");
        JTextField respota4 = new JTextField(25);
        pergunta4.add(respota4);
        cardsPanel.add(pergunta4);
        pergunta4.add(but4);

        JPanel pergunta5 = new JPanel();
        pergunta5.add(new JLabel("O REI JOGOU NA COPA DE 1970?"));
        JButton but5 = new JButton("AVANÇAR");
        JTextField respota5 = new JTextField(25);
        pergunta5.add(respota5);
        cardsPanel.add(pergunta5);
        pergunta5.add(but5);

        JPanel resultado = new JPanel();
        JLabel resuJLabel = new JLabel();
        JButton butR = new JButton("AVANÇAR");
        cardsPanel.add(resultado);
        resultado.add(butR);

        start.addActionListener(e -> {
            cl.next(cardsPanel);
        });
        but1.addActionListener(e -> {
            if (respota1.getText().equals("1")) {
                pontuacao++;
                cl.next(cardsPanel);
            }

        });
        but2.addActionListener(e -> {
            if (respota2.getText().equals("1")) {
                pontuacao++;
                cl.next(cardsPanel);
            }
        });
        but3.addActionListener(e -> {
            if (respota3.getText().equals("1")) {
                pontuacao++;
                cl.next(cardsPanel);
            }
        });
        but4.addActionListener(e -> {
            if (respota4.getText().equals("1")) {
                pontuacao++;
                cl.next(cardsPanel);
            }
        });
        but5.addActionListener(e -> {
            if (respota5.getText().equals("1")) {
                pontuacao++;
                cl.next(cardsPanel);
            }
        });
        butR.addActionListener(e -> {
            
            pontuacao = 0;
            cl.first(cardsPanel);
        });

        // criar botao

        this.add(cardsPanel);
        // set frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

    }

}
