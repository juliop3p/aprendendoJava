package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Julio", 20);
        Aluno aluno2 = new Aluno("Marcio", 28);
        Seminario seminario = new Seminario("Como ser um baita programador e ficar rico.");
        Professor professor = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Rua das araras", "Mato");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);


        seminario.print();
        professor.print();


    }
}
