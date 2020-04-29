public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        float salario = 1000;

        salario += 1000;
        System.out.println(salario); // 2000.0

        salario -= 500;
        System.out.println(salario); // 1500.0

        salario *= 2;
        System.out.println(salario); // 3000.0

        salario /= 3;
        System.out.println(salario); // 1000.0

        salario %= 2;
        System.out.println(salario); // 0.0
    }
}
