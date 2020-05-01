public class Arrays1 {
  public static void main(String[] args) {
    // int idades[]; not recomended
    int[] idades = new int[3];
    String[] fruits = new String[3];
    idades[0] = 20;
    idades[1] = 30;
    idades[2] = 40;
    fruits[0] = "Maça";
    fruits[1] = "Melancia";
    fruits[2] = "Uva";

    for (int i = 0; i < idades.length; i++) {
      System.out.println(idades[i]);
    }

    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }
  }
}