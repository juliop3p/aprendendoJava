package br.com.abc.introducao.arrays;

public class Arrays6 {
  public static void main(String[] args) {
    // Formas de inicialização de um array
    int[] arrInt = { 1, 2, 3 };
    int[] arrInt2 = new int[3];
    int[] arrInt3 = new int[] { 1, 2, 3 };
    // --------------------------
    // int[][] dias = new int[3][0];
    // dias[0] = new int[2];
    // dias[1] = new int[3];
    // dias[2] = new int[4];
    int[][] dias = { { 99, 98 }, { 50, 60, 70 }, { 1, 2, 3, 4, 5 } };

    for (int[] arr : dias) {
      for (int dia : arr) {
        System.out.println(dia);
      }
    }
  }
}