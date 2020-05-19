package Ex02;

public class Pessoa {
    private String name;
    private int birthDate;

    public Pessoa() {
    }

    public Pessoa(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int currentAge() {
        return 2020 - this.birthDate;
    }

    public int currentAgePlusFifty() {
        int agePlusFifty = currentAge() + 50;
        return agePlusFifty;
    }
}
