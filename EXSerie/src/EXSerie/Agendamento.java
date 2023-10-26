package EXSerie;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Agendamento extends JPanel {
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputNome;
    private JTextField inputDesc;
    private DefaultTableModel tableModel;
    private JTable table;

    private List<Agendamento> agenda = new ArrayList<>();
    private int linhaSelecionada = -1;

    public Agendamento() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Descricao");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        inputData = new JTextField(10);
        inputHora = new JTextField(5);
        inputNome = new JTextField(20);
        inputDesc = new JTextField(20);
        // criar botões
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton apagarTodosButton = new JButton("Apagar Todos");
        JButton salvarButton = new JButton("Salvar");
        JPanel inputPanel = new JPanel();
        // adicionar botões
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputNome);
        inputPanel.add(new JLabel("Descricao:"));
        inputPanel.add(inputDesc);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);
        // set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        File arquivo1 = new File("dados.txt");
        if (arquivo1.exists()) {
            agenda = Serializacao.deserializar("dados.txt");
            atualizarTabela();
        }
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputDesc.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputData.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputHora.setText((String) table.getValueAt(linhaSelecionada, 0));
                    
                }
            }
        });
        OperacoesUsuarios operacoes = new OperacoesUsuarios(agenda, tableModel, table);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarUsuario(inputData.getText(), inputHora.getText(), inputNome.getText(),
                        inputDesc.getText());
                inputData.setText("");
                inputHora.setText("");
                inputDesc.setText("");
                inputNome.setText("");
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarUsuario(linhaSelecionada, inputData.getText(),

                        inputHora.getText(), 
                        inputNome.getText(), 
                        inputDesc.getText());

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(linhaSelecionada);
            }
        });
        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosUsuarios();
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios();
            }
        });
    }

    /**
     * 
     */
    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agendamento usuario : agenda) {
            tableModel.addRow(new Object[] { ((Object) usuario).getData(), usuario.getHora(), usuario.getNome(), usuario.getDesc() });
        }
    }

}