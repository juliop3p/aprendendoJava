import java.util.Scanner; // Biblioteca para leitura do teclado

public class TabuadaArray {
  public static void main(String[] args) {
    int[] tabuada = new int[11];
    Scanner ler = new Scanner(System.in); // Instanciar e criar um objeto Scanner
    int numero;

    System.out.printf("Informe um número para a tabuada: ");
    numero = ler.nextInt(); // Lendo um valor inteiro

    for (int i = 0; i < 11; i++) {
      tabuada[i] = (i + 1) * numero;
    }

    System.out.println("Tabuada " + numero);
    for (int resultado : tabuada) {
      System.out.println(resultado);
    }

  }
}