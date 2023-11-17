package View;

import java.util.List;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.CarrosControl;
import Controller.CarrosDAO;
import Model.Carros;

// Atributos(componentes)
public class CarrosPainel extends JPanel {
    private JButton cadastrar, apagar, editar;
    private JTextField carMarcaField, carModeloField, carAnoField, carPlacaField, carValorField;
    private List<Carros> carros;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public CarrosPainel() {
        super();
       // entrada de dados
setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
add(new JLabel("Cadastro Carros"));
JPanel inputPanel = new JPanel();
inputPanel.setLayout(new GridLayout(5, 2));
inputPanel.add(new JLabel("Marca"));
carMarcaField = new JTextField(20);
inputPanel.add(carMarcaField);
inputPanel.add(new JLabel("Modelo"));
carModeloField = new JTextField(20);
inputPanel.add(carModeloField);
inputPanel.add(new JLabel("Ano"));
carAnoField = new JTextField(20);
inputPanel.add(carAnoField);
inputPanel.add(new JLabel("Placa"));

carPlacaField = new JTextField(20);
inputPanel.add(carPlacaField);
inputPanel.add(new JLabel("Valor"));
carValorField = new JTextField(20);
inputPanel.add(carValorField);
add(inputPanel);
JPanel botoes = new JPanel();
botoes.add(cadastrar = new JButton("Cadastrar"));
botoes.add(editar = new JButton("Editar"));
botoes.add(apagar = new JButton("Apagar"));

add(botoes);
// tabela de carros
JScrollPane jSPane = new JScrollPane();
add(jSPane);
tableModel = new DefaultTableModel(new Object[][] {},
new String[] { "Marca", "Modelo", "Ano", "Placa", "Valor" });
table = new JTable(tableModel);
jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        new CarrosDAO().criaTabela();
        // incluindo elementos do banco na criação do painel
        atualizarTabela();
        // tratamenro
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
            linhaSelecionada = table.rowAtPoint(evt.getPoint());
            if (linhaSelecionada != -1) {
            carMarcaField.setText((String) table.getValueAt(linhaSelecionada, 0));
            carModeloField.setText((String) table.getValueAt(linhaSelecionada, 1));
            carAnoField.setText((String) table.getValueAt(linhaSelecionada, 2));
            carPlacaField.setText((String) table.getValueAt(linhaSelecionada, 3));
            carValorField.setText((String) table.getValueAt(linhaSelecionada, 4));
            }
        }      
    } );
CarrosControl operacoes = new CarrosControl(carros, tableModel, table);
   cadastrar.addActionListener(e -> {
            String marca = carMarcaField.getText();
            String modelo = carModeloField.getText();
            String ano = carAnoField.getText();
            String valor = carValorField.getText();
            String placa = carPlacaField.getText();


     if (placa.matches("\\d+") && placa.matches("[a-zA-Z]+")) {
                 JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: Deve ter numero e letra",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            // Verifica se ano contém apenas números
            else if (!ano.matches("\\d+")) {
                // Trate o erro de ano inválido aqui (pode exibir uma mensagem de erro, por
                // exemplo)
                JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: O ano deve ser numérico.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
       // Verifica se modelo e marca contêm apenas letras
            else  if (!marca.matches("[a-zA-Z]+") || !modelo.matches("[a-zA-Z]+")) {
                // Trate o erro de marca ou modelo inválido aqui
                 JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: a marca ou o modelo nao deve ser numérico.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Verifica se valor contém apenas números
            else if (!valor.matches("\\d+")) {
                // Trate o erro de valor inválido aqui
                  JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: O valor deve ser numérico.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }        
               carMarcaField.setText("");
        carModeloField.setText("");
        carAnoField.setText("");
        carValorField.setText("");
        carPlacaField.setText("");
       });  


    editar.addActionListener(e -> {
            String marca = carMarcaField.getText();
            String modelo = carModeloField.getText();
            String ano = carAnoField.getText();
            String valor = carValorField.getText();
            String placa = carPlacaField.getText();

              if (placa.matches("\\d+") && placa.matches("[a-zA-Z]+")) {
                 JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: Deve ter numero e letra",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            // Verifica se ano contém apenas números
           else if (!ano.matches("\\d+")) {
                // Trate o erro de ano inválido aqui (pode exibir uma mensagem de erro, por
                // exemplo)
                JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: O ano deve ser numérico.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
       // Verifica se modelo e marca contêm apenas letras
            else if (!marca.matches("[a-zA-Z]+") || !modelo.matches("[a-zA-Z]+")) {
                // Trate o erro de marca ou modelo inválido aqui
                 JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar:a marca ou o modelo nao deve ser numérico.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Verifica se valor contém apenas números
            else if (!valor.matches("\\d+")) {
                // Trate o erro de valor inválido aqui
                  JOptionPane.showMessageDialog(CarrosPainel.this, "Erro ao cadastrar: O valor deve ser numérico.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }  
            carMarcaField.setText("");
        carModeloField.setText("");
        carAnoField.setText("");
        carValorField.setText("");
        carPlacaField.setText("");    
       });  
   apagar.addActionListener(e->{
        operacoes.apagar(carPlacaField.getText());
        carMarcaField.setText("");
        carModeloField.setText("");
        carAnoField.setText("");
        carValorField.setText("");
        carPlacaField.setText("");
    });        
       
    }

    // metodo
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),

                    carro.getAno(), carro.getPlaca(), carro.getValor() });
        }
    }

}