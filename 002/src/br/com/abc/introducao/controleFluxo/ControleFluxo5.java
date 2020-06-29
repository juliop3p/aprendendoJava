package br.com.abc.introducao.controleFluxo;

public class ControleFluxo5 {
  public static void main(String[] args) {
    double valorTotal = 30000;

    for (int parcela = 1; parcela <= valorTotal; parcela++) {
      double valorParcela = valorTotal / parcela;

      if (valorParcela < 1000) {
        break;
      }

      System.out.println("Parcela " + parcela + " valor parcela R$" + valorParcela);
    }

    for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
      double valorParcela = valorTotal / parcela;

      if (valorParcela < 1000) {
        continue;
      }

      System.out.println("Parcela " + parcela + " valor parcela R$" + valorParcela);
    }
  }
}