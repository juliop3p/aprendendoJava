package Ex03;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("0505", "87875000", 850, "saque", 250);
        conta1.withdraw(conta1.getValue());
        conta1.printCurrentValue();
    }
}
