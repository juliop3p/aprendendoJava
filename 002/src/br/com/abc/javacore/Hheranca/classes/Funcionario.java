package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void print() {
        super.print();
        System.out.println("Salario: R$" + this.salario);
        printReciboPagamento();
    }

    public void printReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de R$" + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}