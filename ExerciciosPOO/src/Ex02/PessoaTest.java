package Ex02;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Julio", 1999);

        System.out.println("Idade atual: " + pessoa1.currentAge() + " anos.");
        System.out.println("Idade daqui 50 anos: " + pessoa1.currentAgePlusFifty() + " anos.");

    }
}
