package Exercicio01;

public class Exercicio01Test {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(1020, "cc", "Julio Cesar");
        conta1.abrirConta();
        conta1.depositar(1800);
        conta1.printExtrato();
    }
}
