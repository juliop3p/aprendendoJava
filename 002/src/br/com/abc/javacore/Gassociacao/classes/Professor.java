package br.com.abc.javacore.Gassociacao.classes;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {

    }

    public void print() {
        System.out.println("----- Relatório de professor -----");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if(this.seminarios != null && seminarios.length != 0) {
            System.out.print("Seminários participantes ");
            for(Seminario sem : this.seminarios) {
                System.out.println(sem.getTitulo() + " ");
            }
        } else {
            System.out.println("Professor não vinculado a nenhum seminário");
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
