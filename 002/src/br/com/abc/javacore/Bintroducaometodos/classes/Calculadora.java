package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros(int a, int b) {
        System.out.println("Soma: " + (a+b));
    }

    public  void subtraiDoisNumeros(int a, int b) {
        System.out.println("Subtração: " + (a-b));
    }

    public  void multiplicaDoisNumeros(int a, byte b) {
        System.out.println("Multiplicação: " + (a*b));
    }

    public double divideDoisNumeros(double a, double b) {
        if(b != 0) {
            return a / b;
        }
        return a / 1;
    }

    public double raizQuadrada(double num) {
        return  Math.sqrt(num);
    }

    public void imprimeDoisNumerosDivididos(double a, double b) {
        if(b != 0) {
            System.out.println("A Divisão é " + a / b);
            return;
        }

        System.out.println("Não é possivel dividor por 0");
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 30;
        b = 40;
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    // se receber mais de um parâmetro o VarArgs precisa ser o último
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
