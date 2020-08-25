package JE_HW_2.Exersise_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(7);
        Car car2 = new Car(6, 1700);
        Car car3 = new Car(5, 1800, 250.6);
        Car car4 = new Car(2,1900, 234.3,"yellow");

        System.out.println("Car: " + car.show());
        System.out.println("Car1: " + car1.show());
        System.out.println("Car2: " + car2.show());
        System.out.println("Car3: " + car3.show());
        System.out.println("Car4: " + car4.show());
    }
}