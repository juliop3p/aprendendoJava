public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000;

        System.out.println(idade >= 18 && salario >= 3000); // false
        System.out.println(idade >= 18 || salario >= 3000); // true
    }
}
