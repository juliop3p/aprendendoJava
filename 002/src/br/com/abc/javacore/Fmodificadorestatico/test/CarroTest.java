package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(220);
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
