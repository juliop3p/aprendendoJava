package br.com.abc.introducao.controleFluxo;

public class ControleFluxo3 {
  public static void main(String[] args) {
    int dia = 4;
    String diaText;

    // char, int, byte, short, enum e String
    switch (dia) {
      case 0:
        diaText = "Domingo";
        break;
      case 1:
        diaText = "Segunda";
        break;
      case 2:
        diaText = "Terça";
        break;
      case 3:
        diaText = "Quarta";
        break;
      case 4:
        diaText = "Quinta";
        break;
      case 5:
        diaText = "Sexta";
        break;
      case 6:
        diaText = "Sabado";
        break;
      default:
        diaText = "Dia não encontrado";
    }

    System.out.println(diaText);

    char sexo = 'M';

    switch (sexo) {
      case 'M':
        System.out.println("Masculino");
        break;
      case 'F':
        System.out.println("Feminino");
        break;
    }
  }
}