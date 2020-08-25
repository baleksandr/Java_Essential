package JE_HW_2.Exersise_4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1);
        Car car2 = new Car(200.8, 1300);
        Car car3 = new Car(3, 2400, "Green");
        Car car4 = new Car(7, 200.5, 4000, "Blue");

        System.out.println("Car: " + car.show());
        System.out.println("Car1: " + car1.show());
        System.out.println("Car2: " + car2.show());
        System.out.println("Car3: " + car3.show());
        System.out.println("Car4: " + car4.show());
    }
}


