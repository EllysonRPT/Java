// package Controll;
// import Model.Elevador;
// import javax.swing.JOptionPane;
// public class Funcao {

//     Elevador sistemaElevadores = new Elevador(0, 3, 7);
    
//     int andarDesejado = Integer.parseInt(JOptionPane.showInputDialog("Digite o andar desejado:"));

//     // Verifica se o andar desejado é válido
//     if (andarDesejado <= 6 && andarDesejado >= -2) {
//         sistemaElevadores.solicitarElevador(andarDesejado);
//     } else {
//         JOptionPane.showMessageDialog(null, "ANDAR INVALIDO");
//     }
//     public void solicitarElevador(int andarDesejado) {
//         // Verifica qual elevador está mais próximo
//         int elevadorMaisProximo = (Math.abs(andarDesejado - elevador1) <= Math.abs(andarDesejado - elevador2))
//                 ? elevador1
//                 : elevador2;

//         // Move o elevador mais próximo
//         if (elevadorMaisProximo == elevador1) {
//             moverElevador(elevador1, andarDesejado);
//             JOptionPane.showMessageDialog(null,
//                     "Elevador 1 está se movendo.\n" + "Elevador 1 está no andar" + andarDesejado);

//         } else {
//             moverElevador(elevador2, andarDesejado);
//             JOptionPane.showMessageDialog(null,
//                     "Elevador 2 está se movendo.\n" + "Elevador 2 está no andar" + andarDesejado);

//         }
//     }
// }