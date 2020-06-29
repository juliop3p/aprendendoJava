package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.getComprador());
        carro.getComprador().setNome("Kuririn");
        System.out.println(carro.getComprador());
    }
}
