package br.com.abc.javacore.Isobrescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

    public String toString() {
        return "Nome: " + this.nome + " idade: " + this.idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
