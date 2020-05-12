package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente0 = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.println("\nDentro do metódo");

        System.out.println("Tamanho: " + cliente0.getParcelas().length);
        System.out.println("Tamanho: " + cliente1.getParcelas().length);
        System.out.println("Tamanho: " + cliente2.getParcelas().length);
    }
}
