package br.com.abc.javacore.Csobrecarmetodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg, String cpf, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String rg, String cpf, double salario) {
        this.init(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.getNome());
        System.out.println(this.getRg());
        System.out.println(this.getCpf());
        System.out.println(this.getSalario());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return this.rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
}
