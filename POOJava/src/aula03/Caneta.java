package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }

    public void rabiscar() {
        if(tampada) {
            System.out.println("Caneta está tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }

    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}
