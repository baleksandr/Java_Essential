package je_HW_3.Exersise_3;

public class Main {
    public static void main(String[] args) {
        Vehicle plain = new Plane(12000, 200, 2020, 20, 250);
        Vehicle ship = new Ship(14000, 300, 2019,250,"New York");
        Vehicle car = new Car(12000, 200, 2);

        System.out.println("Plain: " + plain.toString());
        System.out.println("Ship: " + ship.toString());
        System.out.println("Car: " + car.toString());
    }
}