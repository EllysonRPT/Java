package View;

import java.awt.event.*;
import java.sql.SQLException;
import java.awt.*;
import java.util.List;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Connection.ClientesDAO;
import Connection.VendasDAO;
import Controller.VendasControl;
import Model.Carros;
import Model.Clientes;
import Model.Vendas;

public class VendasPainel extends JPanel {
    // Atributos (componentes)
    private JButton cadastrar, apagar, editar;
    private JComboBox<String> carrosComboBox, clienteComboBox; // Adicionado JComboBox
    private JTextField valorVendaField;
    private List<Vendas> vendas;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor (GUI-JPanel)
    public VendasPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Vendas"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        
        // Adicionado JComboBox para "Carros"
        inputPanel.add(new JLabel("Carros"));
        carrosComboBox = new JComboBox<>();
        carrosComboBox.addItem("Selecione o Carro");
        List<Carros> carros = new CarrosDAO().listarTodos();
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca()
                    + " " + carro.getModelo()
                    + " " + carro.getPlaca());
        }
        inputPanel.add(carrosComboBox);

        // Adicionado JComboBox para "Cliente"
        inputPanel.add(new JLabel("Cliente"));
        clienteComboBox = new JComboBox<>();
        clienteComboBox.addItem("Selecione o Cliente");
        // Preencha o JComboBox com os clientes
        List<Clientes> clientes = new ClientesDAO().listarTodos();
        for (Clientes cliente : clientes) {
            clienteComboBox.addItem(cliente.getCpf() + " " + cliente.getNome());
        }
        inputPanel.add(clienteComboBox);
        
        // Adicionadas outras textfields
        inputPanel.add(new JLabel("Valor da Venda"));
        valorVendaField = new JTextField(20);
        inputPanel.add(valorVendaField);
        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);
        // tabela de vendas
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Carros", "Cliente", "Valor da Venda" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // criar BD
        new VendasDAO().criaTabela();
        // atualizar tabela
        atualizarTabela();

        // tratamento de eventos construtor
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    // Extrai os valores de Carros, Cliente e Valor da Venda da linha selecionada
                    String carrosClienteValor = (String) table.getValueAt(linhaSelecionada, 0);
                    
                    // Divide a string em partes usando espaço como delimitador
                    String[] partes = carrosClienteValor.split(" ");
                    
                    // Define os valores nos JComboBox correspondentes
                    carrosComboBox.setSelectedItem(partes[0] + " " + partes[1] + " " + partes[2]);
                    clienteComboBox.setSelectedItem(partes[3] + " " + partes[4]);
                    
                    valorVendaField.setText((String) table.getValueAt(linhaSelecionada, 2));
                }
            }
        });

        VendasControl operacoes = new VendasControl(vendas, tableModel, table);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco
        // de dados
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém os valores selecionados nos JComboBox
                    String carrosSelecionado = carrosComboBox.getSelectedItem().toString();
                    String clienteSelecionado = clienteComboBox.getSelectedItem().toString();
                    
                    // Chama o método "cadastrar" do objeto operacoes com os valores dos
                    // campos de entrada
                    operacoes.cadastrar(carrosSelecionado, clienteSelecionado, valorVendaField.getText());
                    // Limpa os campos de entrada após a operação de cadastro
                    carrosComboBox.setSelectedIndex(0);
                    clienteComboBox.setSelectedIndex(0);
                    valorVendaField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(VendasPainel.this, "Erro ao cadastrar: O Valor da Venda deve ser numérico.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(VendasPainel.this, "Erro ao cadastrar: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    ex.printStackTrace(); // Adicione um tratamento adequado para a exceção
                    JOptionPane.showMessageDialog(VendasPainel.this, "Erro ao cadastrar: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém os valores selecionados nos JComboBox
                    String carrosSelecionado = carrosComboBox.getSelectedItem().toString();
                    String clienteSelecionado = clienteComboBox.getSelectedItem().toString();
                    
                    // Chama o método "atualizar" do objeto operacoes com os valores dos
                    // campos de entrada
                    operacoes.atualizar(carrosSelecionado, clienteSelecionado, valorVendaField.getText());
                    // Limpa os campos de entrada após a operação de atualização
                    carrosComboBox.setSelectedIndex(0);
                    clienteComboBox.setSelectedIndex(0);
                    valorVendaField.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VendasPainel.this,
                            "Erro ao atualizar dados no banco de dados: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja Apagar?", "Confirmação",
                            JOptionPane.YES_NO_OPTION);
                    // Chama o método "apagar" do objeto operacoes com o valor do campo de
                    // entrada "carros"
                    if (escolha == JOptionPane.YES_OPTION) {
                        operacoes.apagar(carrosComboBox.getSelectedItem().toString());
                        // Limpa os campos de entrada após a operação de exclusão
                        carrosComboBox.setSelectedIndex(0);
                        clienteComboBox.setSelectedIndex(0);
                        valorVendaField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VendasPainel.this,
                            "Erro ao apagar dados no banco de dados: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        vendas = new VendasDAO().listarTodos();
        // Obtém as vendas atualizadas do banco de dados
        for (Vendas venda : vendas) {
            // Adiciona os dados de cada venda como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { venda.getCarros(), venda.getCliente(), venda.getValorVenda() });
        }
    }
}
