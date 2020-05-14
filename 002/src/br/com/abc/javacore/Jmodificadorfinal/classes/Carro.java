package br.com.abc.javacore.Jmodificadorfinal.classes;

public class Carro {
    private static final double VELOCIDADE_LIMITE = 240;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getComprador() {
        return comprador;
    }
}
