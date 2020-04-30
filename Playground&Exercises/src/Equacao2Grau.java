
public class Equacao2Grau {
  public static void main(String[] args) {
    double a = 4, b = -5, c = 1;

    double deltaResult = delta(a, b, c);
    double x1 = bhaskara(a, b, deltaResult, true);
    double x2 = bhaskara(a, b, deltaResult, false);

    System.out.println("Delta: " + deltaResult);
    System.out.println("X1: " + x1);
    System.out.println("X2: " + x2);
  }

  static double delta(double a, double b, double c) {
    return (b * b) - (4 * a * c);
  }

  static double bhaskara(double a, double b, double delta, boolean x1) {
    if (x1) {
      return (-b + Math.sqrt(delta)) / (2 * a);
    } else {
      return (-b - Math.sqrt(delta)) / (2 * a);
    }
  }
}