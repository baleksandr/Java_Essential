package je_HW_2.Exersise_2;

public class Car {
     int year;
     String color;

    public Car() {
        year = 8;
        color = "Black";

    }

    public Car(int year) {
        this.year = year;
        color = "white";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
