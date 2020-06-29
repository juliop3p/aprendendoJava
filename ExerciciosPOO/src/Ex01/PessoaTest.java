package Ex01;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Julio", "julio@gmail.com", "(13) 91234-4567");
        pessoa1.printVisitCard();

        Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com", "(11) 99876-5432");
        pessoa2.printVisitCard();
    }
}
