package Ex04;

public class Voo {
    private int flyNumber;
    private String date;
    private String time;
    private int passengersNumber;

    public void includePassengers(int passengers) {
        if(this.getPassengersNumber() + passengers > 50) {
            System.out.println("Quantidade excede número total de passageiros.");
        } else {
            this.setPassengersNumber(this.getPassengersNumber() + passengers);
        }
    }

    @Override
    public String toString() {
        return "Voo{" +
                "flyNumber=" + flyNumber +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", passengersNumber=" + passengersNumber +
                '}';
    }

    public Voo(int flyNumber, String date, String time) {
        this.flyNumber = flyNumber;
        this.date = date;
        this.time = time;
        this.passengersNumber = 0;
    }

    public int getFlyNumber() {
        return flyNumber;
    }

    public void setFlyNumber(int flyNumber) {
        this.flyNumber = flyNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
