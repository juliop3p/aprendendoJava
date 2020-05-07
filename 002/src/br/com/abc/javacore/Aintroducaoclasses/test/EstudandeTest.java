package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudandeTest {
  public static void main(String[] args) {
    Estudante joao = new Estudante();
    joao.nome = "João";
    joao.matricula = "1212";
    joao.idade = 16;

    System.out.println(joao.nome);
    System.out.println(joao.idade);
    System.out.println(joao.matricula);
  }
}