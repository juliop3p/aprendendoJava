package Ex04;

public class VooTest {
    public static void main(String[] args) {
        Voo v1 = new Voo(1558, "25/06/2020", "18H30min");

        v1.includePassengers(20);
        v1.includePassengers(20);
        v1.includePassengers(20);

        System.out.println(v1.toString());
    }
}
