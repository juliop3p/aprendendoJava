package aula09;

public class Bolsista extends Aluno {
    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
