package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.armazenarDados("Julio", 20, 9,8,10);

        Estudante estudante2 = new Estudante();
        estudante2.armazenarDados("Diego", 20, 5,6,2);

        estudante.imprimirDadosDoEstudante();
        System.out.println("--------------//--------------");
        estudante2.imprimirDadosDoEstudante();
    }
}
