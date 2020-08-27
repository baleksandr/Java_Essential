package je_HW_3.Exersise_3;

public class Plane extends Vehicle{
    double height;
    int count;

    public Plane(int cost, int speed, int year ,double height, int count) {
        super(cost, speed, year);
        this.height = height;
        this.count = count;
    }
    @Override
    public String toString() {
        return "cost = " + cost + " speed = " + speed + " year = "
                + year + " count = " + count + " height = " + height;
    }
}