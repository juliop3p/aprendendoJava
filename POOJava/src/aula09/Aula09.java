package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Julio", 20, "M");
        Aluno a1 = new Aluno("Claúdio", 22, "M", 552, "Informática");

        System.out.println(v1.toString());

        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista("Maria", 20, "F", 5878, "ADM", 336f);
        b1.pagarMensalidade();
    }
}
