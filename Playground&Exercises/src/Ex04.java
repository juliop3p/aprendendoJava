
public class Ex04 {
  public static void main(String[] args) {
    int dia = 4;

    // char, int, byte, short, enum e String
    switch (dia) {
      case 1:
      case 7:
        System.out.println("Final de semana");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("Dia útil");
        break;

    }
  }
}