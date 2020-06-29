package Ex01;

public class Pessoa {
    private String name;
    private String email;
    private String phone;

    public Pessoa() {
    }

    public Pessoa(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printVisitCard() {
        System.out.println("--- Cartão de Visita ---");
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("------------------------");
    }
}
