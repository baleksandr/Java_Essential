package je_HW_3.Exersise_3;

public class Car extends Vehicle {
    public Car(int price, int speed, int year) {
        super(price, speed, year);

    }
    @Override
    public String toString() {
        return "cost = " + getCost() + " speed = " +
                getSpeed() + " year = " + getYear();
    }
}