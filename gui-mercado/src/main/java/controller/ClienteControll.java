package Controller;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;

import Model.Clientes;
import app.Connection.ClientesDAO;

/**
 * ClientesControl
 */
public class ClienteControll {
    // Atributos
    private List<Clientes> clientes;

    // construtor
    public ClienteControll(List<Clientes> clientes) {
        this.clientes = clientes;

    }
    ////////

    // métodos CRUD

    // Método para atualizar a tabela de exibição com dados do banco de dados

    // Método para cadastrar um novo cliente no banco de dados
    public void cadastrar(String cpf, String nome) {
        // depuracao

        new ClientesDAO().cadastrar(cpf, nome);
        // Chama o método de cadastro no banco de dados

    }

    // Método para atualizar os dados de um cliente no banco de dados
    public List<Clientes> listarClientes(String cpf) {

        clientes = new ClientesDAO().listarClientes(cpf);
        
        return clientes;

    }

}
