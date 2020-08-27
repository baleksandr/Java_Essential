package je_HW_2.Exersise_3;

public class Car {
    private int year;
    private int weight;
    private double speed;
    private String color;

    public Car(){
        this(8, 1350, 180.4, "Bleak");
    }

    public Car(int year){
        this.year = year;
        this.weight = 1480;
        this.speed = 200.4;
        this.color = "Bleak";
    }

    public Car(int year, int weight){
        this.year = year;
        this.weight = weight;
        this.speed = 250.4;
        this.color = "Bleak";
    }

    public Car(int year, int weight, double speed){
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = "Bleak";
    }

    public Car(int year, int weight, double speed, String color){
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }

    public String show (){
        return "year = " + year + ", speed = " + speed + ", weight = " + weight + ", color = " + color;
    }
}
