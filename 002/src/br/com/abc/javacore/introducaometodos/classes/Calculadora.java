package br.com.abc.javacore.introducaometodos.classes;

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
}
