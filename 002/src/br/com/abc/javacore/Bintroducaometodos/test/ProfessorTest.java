package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.nome = "Matheus";
    professor.matricula = "4525";
    professor.rg = "25.785.126-4";
    professor.cpf = "485.624.852-36";

    Professor professor2 = new Professor();
    professor2.nome = "Aline";
    professor2.matricula = "0223";
    professor2.rg = "35.755.126-4";
    professor2.cpf = "285.624.852-36";

    professor.imprime();
    System.out.println("------------------------");
    professor2.imprime();

  }
}