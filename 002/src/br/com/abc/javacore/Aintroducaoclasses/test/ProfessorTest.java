package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.nome = "Matheus";
    professor.matricula = "4525";
    professor.rg = "25.785.126-4";
    professor.cpf = "485.624.852-36";

    System.out.println("Nome: " + professor.nome);
    System.out.println("Matricula: " + professor.matricula);
    System.out.println("RG: " + professor.rg);
    System.out.println("CPF: " + professor.cpf);
  }
}