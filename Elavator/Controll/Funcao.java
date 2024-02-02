import javax.swing.JOptionPane;
import Model.Elevador;

// Classe Funcao que contém métodos relacionados ao elevador
public class Funcao {

    // Criando um objeto da classe Elevador
    Elevador elevador1 = new Elevador(0, 0, 0, 0);
    Elevador elevador2 = new Elevador(0, 0, 0, 0);

    // Método para chamar o elevador
    public void Chamar() {
        // Loop enquanto a pergunta for verdadeira
        boolean pergunta = true;
        while (pergunta) {
            // Solicitando ao usuário que informe o andar desejado
            int andarDesejado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o andar"));

            // Verificando se o andar desejado está dentro de limites válidos
            if (andarDesejado >= -2 && andarDesejado <= 6) {

                // Calculando as distâncias dos elevadores até o andar desejado
                int distanciaElevador1 = Math.abs(elevador1.getAndarAtual() - andarDesejado);
                int distanciaElevador2 = Math.abs(elevador2.getAndarAtual() - andarDesejado);

                // Escolhendo o elevador mais próximo
                Elevador elevadorEscolhido;
                if (distanciaElevador1 < distanciaElevador2) {
                    elevadorEscolhido = elevador1;
                    elevadorEscolhido.setAndarDesejado(andarDesejado);
                    elevador1.setAndarDesejado(andarDesejado);
                    JOptionPane.showMessageDialog(null, "Elevador 1 está no andar " + elevador1.getAndarDesejado());
                } else if (distanciaElevador2 < distanciaElevador1) {
                    elevadorEscolhido = elevador2;
                    elevadorEscolhido.setAndarDesejado(andarDesejado);
                    elevador2.setAndarDesejado(andarDesejado);
                    JOptionPane.showMessageDialog(null, "Elevador 2 está no andar " + elevador1.getAndarDesejado());
                }

                else {
                    // Se ambos estiverem na mesma distância, escolhe aleatoriamente
                    elevadorEscolhido = (Math.random() < 0.5) ? elevador1 : elevador2;
                }
                // Movimentando o elevador escolhido para o andar desejado

                // Exibindo mensagem com o estado do elevador escolhido

                // Configurando o andar desejado no elevador e exibindo uma mensagem

            } else {
                // Exibindo uma mensagem de andar inválido se estiver fora dos limites
                JOptionPane.showMessageDialog(null, "ANDAR INVALIDO");
            }

            // Perguntando ao usuário se deseja chamar o elevador novamente
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja chamar o elevador novamente?");
            // Se a resposta for diferente de YES, o loop é encerrado
            if (resposta != JOptionPane.YES_OPTION) {
                pergunta = false;
            }
        }
    }

    // Método principal (seguindo o padrão do Java, que é o mesmo nome da classe)
    public static void main(String[] args) {
        // Criando um objeto da classe Funcao
        Funcao funcao = new Funcao();
        // Chamando o método Chamar para simular o uso do elevador
        funcao.Chamar();
    }
}
