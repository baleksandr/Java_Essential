package je_HW_2.Exersise_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(3);
        Car car2 = new Car(3, "Green");

        System.out.println(car.year + " " + car.color);
        System.out.println(car1.year + " " + car1.color);
        System.out.println(car2.year + " " + car2.color);
    }
}