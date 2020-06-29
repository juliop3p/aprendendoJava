package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Julio", 20, "M");
        p[1] = new Pessoa("Maria", 22, "F");

        l[0] = new Livro("Clean Code", "somebody", 525, p[0]);
        l[1] = new Livro("Aprendendo Java", "José da Silva", 300, p[1]);
        l[2] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[0]);

        l[0].abrir();
        l[0].folhear(55);
        l[0].avancarPag();
        l[0].detalhes();
    }
}
