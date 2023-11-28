
package view;

import model.Produto;
import model.Registro;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import javafx.event.ActionEvent;

import model.Cliente;

public class Painelvendas {
public Painelvendas() {
      super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Clientes"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        inputPanel.add(new JLabel("CPF"));
        cpfField = new JTextField(20);
        inputPanel.add(cpfField);
        inputPanel.add(new JLabel("Nome"));
        nomeField = new JTextField(20);
        inputPanel.add(nomeField);
        add(inputPanel);
        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);
        // tabela de clientes
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "CPF", "Nome" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // criar BD
        new ClientesDAO().criaTabela();
        // atualizar tabela
        atualizarTabela();

        // tratamento de eventos construtor
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    cpfField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    nomeField.setText((String) table.getValueAt(linhaSelecionada, 1));
                }
            }
        });

        ClientesControl operacoes = new ClientesControl(clientes, tableModel, table);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco
        // de dados

        /////////////   
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Chama o método "cadastrar" do objeto operacoes com os valores dos
                    // campos de entrada
                    operacoes.cadastrar(cpfField.getText(), nomeField.getText());
                    // Limpa os campos de entrada após a operação de cadastro
                    cpfField.setText("");
                    nomeField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ClientePainel.this, "Erro ao cadastrar: O CPF deve ser numérico.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(ClientePainel.this, "Erro ao cadastrar: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    ex.printStackTrace(); // Adicione um tratamento adequado para a exceção
                    JOptionPane.showMessageDialog(ClientePainel.this, "Erro ao cadastrar: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Chama o método "atualizar" do objeto operacoes com os valores dos
                    // campos de entrada
                    operacoes.atualizar(cpfField.getText(), nomeField.getText());
                    // Limpa os campos de entrada após a operação de atualização
                    cpfField.setText("");
                    nomeField.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(ClientePainel.this,
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
                    // entrada "cpf"
                    if (escolha == JOptionPane.YES_OPTION) {
                        operacoes.apagar(cpfField.getText());
                        // Limpa os campos de entrada após a operação de exclusão
                        cpfField.setText("");
                        nomeField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação Cancelada!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(ClientePainel.this,
                            "Erro ao apagar dados no banco de dados: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os clientes atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada cliente como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getCpf(), cliente.getNome() });
        }
    }
}
}
