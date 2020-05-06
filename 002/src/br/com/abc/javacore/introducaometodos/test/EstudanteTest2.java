package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante2;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante2 estudante = new Estudante2();
        estudante.setNome("Julio");
        estudante.setIdade(20);
        estudante.setNotas(new double[]{9, 8, 10});
        estudante.imprimirDadosDoEstudante();

        System.out.println(estudante.getNome());
    }
}
