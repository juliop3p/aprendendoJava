package br.com.java.classes;

public class Todos {
    public int id;
    public String[] todos = new String[10];
    int counter = 0;

    public void addTodo(String newTodo) {
        todos[counter] = newTodo;
        counter++;
        System.out.println("Novo Todo adicionado com sucesso.");
    }

    public void listTodos() {
        for(int i =0; i<todos.length; i++) {
            if(todos[i] == null) {
                break;
            }
            System.out.println(todos[i]);
        }
    }
}
