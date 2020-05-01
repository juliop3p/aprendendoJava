import java.util.Scanner;

public class ExercicioFacul01 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            A[i] = ler.nextInt();
        }

        System.out.println("---------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            B[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(C[i]);
        }
    }
}
