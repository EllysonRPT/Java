
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//classe
public class TodoList extends JFrame {
    // atributos (botões, caixas de texto, listas e combos)
    private JPanel mainPanel;
    private JTextField taskInputField;
    private JButton addButton;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private JButton deleteButton;
    private JButton markDoneButton;
    private JComboBox<String> filterComboBox;
    private JButton clearCompletedButton;
    private List<Task> tasks;

    // construtor
    public TodoList() {
        // Configuração da janela principal
        super("Tratamento");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // definição de tamanho da janela
        this.setSize(450, 400);
        // Inicializa o painel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        // Inicializa campos de entrada, botões e JComboBox
        taskInputField = new JTextField();
        addButton = new JButton("Adicionar");
        deleteButton = new JButton("Excluir");
        markDoneButton = new JButton("Concluir");
        // caixa de seleção
        filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas",
                "Concluídas" });
        clearCompletedButton = new JButton("Limpar Concluídas");
        // Configuração do painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        //posicionamento
        inputPanel.add(taskInputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);
        // Configuração do painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        //adicionar
        buttonPanel.add(deleteButton); //deletar
        buttonPanel.add(markDoneButton);// concluida
        buttonPanel.add(filterComboBox); //foltrar
        buttonPanel.add(clearCompletedButton);//limpar
        // Adiciona os componentes ao painel principal
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        // Adiciona o painel principal à janela
        this.add(mainPanel);
        // Configuração de Listener para os Eventos

           // Tratamento de evento para limpar tarefas concluídas
        clearCompletedButton.addActionListener(e -> {
            clearCompletedTasks();
        });
           // Tratamento de evento para excluir
        deleteButton.addActionListener(e -> {
            deleteTask();
        });
         // Tratamento de evento para adicionar tarefa
        addButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
             String taskDescription = taskInputField.getText().trim(); // remove espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            updateTaskList();
            taskInputField.setText("");
            // Ação a ser executada quando o botão é clicado
                JOptionPane.showMessageDialog(null, "Item adicionado!");
        }
                
            }
        });

        // addButton.addActionListener(e -> {
        //    addTask();
        // });
        
        markDoneButton.addActionListener(e -> {
          markTaskDone();
         
        });
        filterComboBox.addActionListener(e -> {
          filterTasks();
        });
// Tratamento de evento de teclado para o campo de entrada de tarefa
        taskList.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    deleteTask();
                }
            }
        });

        // Tratamento de evento de teclado para o campo de entrada de tarefa
        taskInputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    addTask();
                }
            }
        });
    
        // Tratamento de evento de fechamento da janela
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a aplicação?", "Fechar Aplicação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    dispose(); // Fecha a janela
                }
            }
        });
        
    
       
    }

   
   // métodos para o CRUD
 private void markTaskDone() {
        // Marca a task selecionada como concluída
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
                Task task = tasks.get(selectedIndex);
                task.setDone(true);
                updateTaskList();
            }
        } else {
            JOptionPane.showMessageDialog(null, "OK!");
        }}

    }
    
    private void addTask() {
        // Adiciona uma nova task à lista de tasks
        String taskDescription = taskInputField.getText().trim(); // remove espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            updateTaskList();
            taskInputField.setText("");
        }
    }

    private void deleteTask() {
        // Exclui a task selecionada da lista de tasks
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            tasks.remove(selectedIndex);
            updateTaskList();
        }
    }

   
    private void filterTasks() {
        // Filtra as tasks com base na seleção do JComboBox
        String filter = (String) filterComboBox.getSelectedItem();
        listModel.clear();
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") &&
                    !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task.getDescription());
            }
        }
    }

    private void clearCompletedTasks() {
        // Limpa todas as tasks concluídas da lista
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isDone()) {
                completedTasks.add(task);
            }
        }
        tasks.removeAll(completedTasks);
        updateTaskList();
    }

    private void updateTaskList() {
        // Atualiza a lista de tasks exibida na GUI
        listModel.clear();
        for (Task task : tasks) {
            listModel.addElement(task.getDescription() + (task.isDone() ?

                    " (Concluída)" : ""));

        }
    }

    public void run() {
        // Exibe a janela
        this.setVisible(true);
    }
}
