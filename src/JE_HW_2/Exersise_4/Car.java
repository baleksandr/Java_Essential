package je_HW_2.Exersise_4;

public class Car {
    public int year;
    double speed;
    int weight;
    String color;


    public Car() {
        this(3, 220.9, 860, "White");
    }

    public Car(int year) {
        this(120, 800);
        this.year = year;
        color = "Yellow";
    }

    public Car(double speed, int weight) {
        year = 4;
        this.speed = speed;
        this.weight = weight;
        color = "Green";

    }

    public Car(int year, int weight, String color) {
        this.year = year;
        speed = 230;
        this.weight = weight;
        this.color = color;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public String show (){
        return "year = " + year + ", speed = " + speed + ", weight = " + weight + ", color = " + color;
    }
}
