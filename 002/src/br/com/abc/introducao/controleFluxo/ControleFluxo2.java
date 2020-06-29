package br.com.abc.introducao.controleFluxo;

public class ControleFluxo2 {
  public static void main(String[] args) {
    int idade = 20;
    String status;

    status = idade > 17 ? "Adulto" : "Não Adulto";

    System.out.println(status);
  }
}