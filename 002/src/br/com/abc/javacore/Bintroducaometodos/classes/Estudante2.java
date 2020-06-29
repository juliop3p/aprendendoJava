package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante2 {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprimirDadosDoEstudante() {
        System.out.println("Estudante: " + this.nome);
        System.out.println("Idade: " + this.idade);
        imprimeNotas();
        double mediaNota = media();

        if(mediaNota > 6) {
            this.aprovado = true;
            System.out.println("Aprovado");
        } else {
            this.aprovado = false;
            System.out.println("Reprovado");
        }
    }

    private void imprimeNotas() {
        int contador = 1;
        for(double nota : this.notas) {
            System.out.println("Nota " + contador + ": " + nota);
            contador++;
        }
    }

    private double media() {
        double soma = 0;
        for(double nota : this.notas) {
            soma += nota;
        }
        return soma / 3;
    }

    // Getters and Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }
}
