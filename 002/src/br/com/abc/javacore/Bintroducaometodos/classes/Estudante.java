package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

    public void armazenarDados(String nome, int idade, double... notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public void imprimirDadosDoEstudante() {
        System.out.println("Estudante: " + this.nome);
        System.out.println("Idade: " + this.idade);
        imprimeNotas();
        double mediaNota = media();

        if(mediaNota > 6) {
            System.out.println("Aprovado");
        } else System.out.println("Reprovado");
    }

    public void imprimeNotas() {
        int contador = 1;
        for(double nota : this.notas) {
            System.out.println("Nota " + contador + ": " + nota);
            contador++;
        }
    }

    public double media() {
        double soma = 0;
        for(double nota : this.notas) {
            soma += nota;
        }
        return soma / 3;
    }
}
