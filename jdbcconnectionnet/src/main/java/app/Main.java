package app;

import Connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // new ConnectionDAO().criaTabela();
        new ConnectionDAO().inserir("ELLL", "null@gmail.com");
    }
}