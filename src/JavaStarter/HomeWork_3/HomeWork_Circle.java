package JavaStarter.HomeWork_3;

public class HomeWork_Circle {
    static double square(double a) {
        double result = a * a;
        return result;
    }

    public static void main(String[] args) {
        double radius = square(13);

        double S = Math.PI * radius;
        System.out.println("The radius of the circle is: " + S + "R");
        System.out.println("Round radius of the circle is: " +  Math.round(S) + "R");
    }
}
