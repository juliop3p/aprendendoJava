package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {
    private Aluno[] alunos;
    private Local local;
    private Professor professor;
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print() {
        System.out.println("----- Relatório de seminários -----");
        System.out.println("Titulo: " + this.titulo);
        if(this.professor != null) {
            System.out.println("Professor palestrante " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado.");
        }

        if(this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado.");
        }

        if(this.alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes");
            for(Aluno aluno : this.alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
