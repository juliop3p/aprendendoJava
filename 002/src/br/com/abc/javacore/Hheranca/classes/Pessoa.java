package br.com.abc.javacore.Hheranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor pessoa");
        this.nome = nome;
    }

    static {
        System.out.println("Bloco de inicialização estático");
    }

    {
        System.out.println("Dentro do bloco de inicialização 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    public Pessoa() {

    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
