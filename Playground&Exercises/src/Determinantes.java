import java.util.Scanner;

public class Determinantes {
  public static void main(String[] args) {
    double[][] matriz = new double[3][3];
    double diagonalPrincipal, diagonalSecundaria, resultado;
    Scanner ler = new Scanner(System.in);

    for(int i=0; i<matriz.length; i++) {
      for(int j=0; j<matriz[i].length; j++) {
        System.out.print("Ai" + (i+1) + " | " + " Aj" + (j+1)+": ");
        matriz[i][j] = ler.nextDouble();
      }
    }

    diagonalPrincipal = (matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0]) + (matriz[0][2] * matriz[1][0] * matriz[2][1]);
    diagonalSecundaria = (matriz[2][0] * matriz[1][1] * matriz[0][2]) + (matriz[2][1] * matriz[1][2] * matriz[0][0]) + (matriz[2][2] * matriz[1][0] * matriz[0][1]);
    resultado = diagonalPrincipal - diagonalSecundaria;
    System.out.println("Resultado dessa matriz é: " + resultado);
  }

}