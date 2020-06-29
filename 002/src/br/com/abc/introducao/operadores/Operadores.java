package br.com.abc.introducao.operadores;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2); // 30
        System.out.println("A soma eh: " + n1 + n2); // A soma eh: 1020
        System.out.println("A soma eh: " + (n1 + n2)); // A soma eh: 30
        System.out.println("A subtração eh: " + (n1 - n2)); // A subtração eh: -10
        System.out.println("O resto da divisão eh: " + (n1 % 2)); // O resto da divisão eh: 0 -> ou seja o numero divido
                                                                  // é par
    }
}
