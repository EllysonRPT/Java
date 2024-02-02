package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Elevador;

public class ElevadorGUI extends JFrame {

    private Elevador elevador1 = new Elevador();
    private Elevador elevador2 = new Elevador();

    public ElevadorGUI() {
        super("Simulação de Elevadores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(null); // Usando layout nulo para posicionar os componentes manualmente

        JLabel elevador1Label = new JLabel("Elevador 1 - Andar Atual: " + elevador1.getAndarAtual());
        elevador1Label.setBounds(10, 10, 180, 20);
        panel.add(elevador1Label);

        JLabel elevador2Label = new JLabel("Elevador 2 - Andar Atual: " + elevador2.getAndarAtual());
        elevador2Label.setBounds(200, 10, 180, 20);
        panel.add(elevador2Label);

        JButton chamarElevadorButton = new JButton("Chamar Elevador 1");
        chamarElevadorButton.setBounds(10, 40, 180, 30);
        chamarElevadorButton.addActionListener(e -> chamarElevador(1));
        panel.add(chamarElevadorButton);

        JButton chamarElevador2Button = new JButton("Chamar Elevador 2");
        chamarElevador2Button.setBounds(200, 40, 180, 30);
        chamarElevador2Button.addActionListener(e -> chamarElevador(2));
        panel.add(chamarElevador2Button);

        add(panel);
        setVisible(true);
    }

    private void chamarElevador(int numeroElevador) {
        // Lógica para chamar o elevador com base no número fornecido
        // Neste exemplo, apenas atualizamos o andar atual do elevador chamado
        if (numeroElevador == 1) {
            elevador1.setAndarAtual(3); // Substitua pela lógica real
        } else if (numeroElevador == 2) {
            elevador2.setAndarAtual(5); // Substitua pela lógica real
        }

        // Atualiza os rótulos com os andares atuais dos elevadores
        atualizarRotulos();
    }

    private void atualizarRotulos() {
        // Atualiza os rótulos com os andares atuais dos elevadores
        // Este método pode ser expandido conforme necessário
        // Por enquanto, apenas atualizamos os rótulos na GUI
        atualizarRotuloElevador1();
        atualizarRotuloElevador2();
    }

    private void atualizarRotuloElevador1() {
        // Atualiza o rótulo do elevador 1
        // Pode ser expandido conforme necessário
        // Por enquanto, apenas atualizamos o rótulo na GUI
        ((JLabel) getContentPane().getComponent(0)).setText("Elevador 1 - Andar Atual: " + elevador1.getAndarAtual());
    }

    private void atualizarRotuloElevador2() {
        // Atualiza o rótulo do elevador 2
        // Pode ser expandido conforme necessário
        // Por enquanto, apenas atualizamos o rótulo na GUI
        ((JLabel) getContentPane().getComponent(1)).setText("Elevador 2 - Andar Atual: " + elevador2.getAndarAtual());
    }

    public static void main(String[] args) {
        new ElevadorGUI();
    }
}
