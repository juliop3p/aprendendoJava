package aula08;

public class Aula08 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Julio", 20, "M");
        Aluno p2 = new Aluno("Mario", 28, "M", 1225, "Sistemas de Informação");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
