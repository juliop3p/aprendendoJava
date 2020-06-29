package br.com.abc.introducao.controleFluxo;

public class ControleFluxo4 {
  public static void main(String[] args) {
    int i = 0;

    while (i < 10) {
      System.out.println(++i);
    }

    do {
      System.out.println("Dentro do Do While");
    } while (i < 10);

    for (int j = 0; j < 10; j++) {
      System.out.println("Valor de i é " + j);

      if (j < 5) {
        continue;
      } else {
        break;
      }
    }
  }
}