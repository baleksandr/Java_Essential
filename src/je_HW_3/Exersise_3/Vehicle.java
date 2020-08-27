package je_HW_3.Exersise_3;

public class Vehicle {
    int cost;
    int speed;
    int year;

    Vehicle(int cost, int speed, int year){
        this.cost = cost;
        this.speed = speed;
        this.year= year;
    }

    public int getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
}