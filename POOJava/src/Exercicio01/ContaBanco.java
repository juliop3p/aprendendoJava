package Exercicio01;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void printExtrato() {
        System.out.println("--- EXTRATO BANCÁRIO ---");
        System.out.println("Dono: " + this.dono);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Status: " + this.status);
        System.out.println("Saldo: R$" + this.saldo);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        if(this.tipo == "cc") {
            this.status = true;
            this.saldo = 50;
        } else if(this.tipo == "cp") {
            this.status = true;
            this.saldo = 150;
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA! tipo de conta inválido.");
        }
    }

    public void fecharConta() {
        if(this.saldo > 0) {
            System.out.println("OPERAÇÃO INVÁLIDA! conta possuí saldo positivo.");
        }else if(this.saldo < 0) {
            System.out.println("OPERAÇÃO INVÁLIDA! conta possuí saldo negativo.");
        } else {
            this.status = false;
        }
    }

    public void depositar(double valor) {
        if(this.status) {
            this.saldo += valor;
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA! não pode depositar em uma conta fechada.");
        }
    }

    public void sacar(double valor) {
        if(this.status && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA! conta fechada ou saldo menor que o saque");
        }
    }

    public void pagarMensal() {
        if(this.tipo == "cc" && this.status) {
            this.saldo -= 12;
        } else if(this.tipo == "cp" && this.status) {
            this.saldo -= 20;
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA! conta fechada ou tipo de conta inválido!");
        }
    }
}
