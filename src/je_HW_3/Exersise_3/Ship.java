package je_HW_3.Exersise_3;

public class Ship extends Vehicle {
    int count;
    String port;

    public Ship(int cost, int speed, int year, int count, String port) {
        super(cost, speed, year);
        this.count = count;
        this.port = port;
    }

    @Override
    public String toString() {
        return "cost = " + cost + " speed = " + speed + " year = " + year + " count = " + count + " port = " + port;
    }
}
