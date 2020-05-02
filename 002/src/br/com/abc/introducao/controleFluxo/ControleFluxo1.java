package br.com.abc.introducao.controleFluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 18;
        int salario = 3001;

        if (idade >= 18 || salario <= 3000) {
            System.out.println("Está apto a receber o beneficio");
        } else {
            System.out.println("Não está apto a receber o beneficio");
        }

        boolean z = false;

        if (z = true) {
            System.out.println("Sim isso seria true por que é uma atribuição e não uma comparação");
        }
    }
}
