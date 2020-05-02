package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
  public static void main(String[] args) {
    Carro carro = new Carro();

    carro.modelo = "Hb20 2020";
    carro.placa = "MAX-3030";
    carro.velocidadeMaxima = 220f;

    System.out.println(carro.modelo);
    System.out.println(carro.placa);
    System.out.println(carro.velocidadeMaxima);
  }
}