package aula02;

public class aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.tampada = false;
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
