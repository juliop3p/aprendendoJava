package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    // Velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("-------------------------");
        System.out.println(this.nome);
        System.out.println("Velocidade Maxima " + this.velocidadeMax + "km/h");
        System.out.println("Velocidade Limite " + this.velocidadeLimite + "km/h");
    }

    public Carro() {
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return this.velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
