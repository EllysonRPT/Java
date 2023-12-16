package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import Model.Estoque;
import app.Connection.EstoqueDAO;

public class EstoqueControl {
    // atributos
    private List<Estoque> produtos;
    private DefaultTableModel tableModel;
    private JTable table;

    // contrutor
    public EstoqueControl(List<Estoque> produtos, DefaultTableModel tableModel, JTable table) {
        this.produtos = produtos;
        this.tableModel = tableModel;
        this.table = table;
    }
    // metodos CRUD
    //////////////

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        produtos = new EstoqueDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Estoque produto : produtos) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { produto.getCodBarra(), produto.getNomeProduto(),

                    produto.getQuantiProduto(),produto.getValor() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String codBarra, String quantiProduto, String nomeProduto, String valor) {

        new EstoqueDAO().cadastrar(codBarra,quantiProduto,nomeProduto,valor);
        // Chama o método de cadastro no banco de dadosatualizarTabela(); // Atualiza a
        // tabela de exibição após o cadastro
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização

    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String codBarra, String quantiProduto, String nomeProduto, String valor) {
        new EstoqueDAO().atualizar(codBarra,quantiProduto,nomeProduto,valor);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String placa) {
        new EstoqueDAO().apagar(placa);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }

    //Busca Produto peol código

    //atualizar produtoQuantidade
}