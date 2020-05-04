package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(5, 10);
        calculadora.subtraiDoisNumeros(25, 15);
        calculadora.multiplicaDoisNumeros(5, (byte)5);
        System.out.println("Divisão: " + calculadora.divideDoisNumeros(7, 0));
        System.out.println("Raiz Quadradra: " + calculadora.raizQuadrada(49));
        calculadora.imprimeDoisNumerosDivididos(8, 0);
    }
}
