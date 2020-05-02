package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.nome = "Matheus";
    professor.matricula = "4525";
    professor.rg = "257851264";
    professor.cpf = "48562485236";

    System.out.println("Nome: " + professor.nome);
    System.out.println("Matricula: " + professor.matricula);
    System.out.println("RG: " + professor.rg);
    System.out.println("CPF: " + professor.cpf);
  }
}