package br.com.java;

public class ExercicioFacul02 {
    public static void main(String[] args) {
        double[][] matriz = new double[][]{{1, 2, 6}, {-1, -8, 0}};
        double d;
        double x;
        double y;

        /*
         * [0][0] [0][1] [0][2]
         *  -1     -4      0
         *   3      2      5
         * [1][0] [1][1] [1][2]
         * */

        if(matriz[1][0] * matriz[0][1] > -1) {
            d = matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];
        } else {
            d = matriz[0][0] * matriz[1][1] + (matriz[1][0] * matriz[0][1] * -1);

        }

        if(matriz[1][2] * matriz[0][1] > -1) {
            x = matriz[0][2] * matriz[1][1] - matriz[1][2] * matriz[0][1];
        } else {
            x = matriz[0][2] * matriz[1][1] + (matriz[1][2] * matriz[0][1] * -1);
        }

        if(matriz[1][0] * matriz[0][2] > -1) {
            y = matriz[0][0] * matriz[1][2] - matriz[1][0] * matriz[0][2];
        } else {
            y = matriz[0][0] * matriz[1][2] + (matriz[1][0] * matriz[0][2] * -1);
        }

        double dx = x / d;
        double dy = y / d;

        System.out.println("D: " + d);
        System.out.println("Dx: " + dx);
        System.out.println("DY: " + dy);

    }

}

