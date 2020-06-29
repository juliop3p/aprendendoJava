package br.com.java.test;

import java.util.Scanner;
import br.com.java.classes.Todos;

public class TodoTest {
    public static void main(String[] args) {
        Todos todo = new Todos();
        int option = 0;


        while(option != 3) {
            Scanner scanOption = new Scanner(System.in);
            System.out.print("(1) Adicionar TODO - (2) Listar TODOS - (3) Sair: ");
            option = scanOption.nextInt();

            if(option == 1) {
                Scanner scanTodo = new Scanner(System.in);
                System.out.print("Descreva o TODO: ");
                todo.addTodo(scanTodo.nextLine());
            } else if(option == 2) {
                todo.listTodos();
            } else {
                option = 3;
                System.out.println("Saindo...");
            }

            System.out.println("---------------------------##---------------------------");
        }
    }
}
