package JavaStarter.HomeWork_3;

public class HomeWork_Volume {
    static double square(double a) {
        double result = a * a;
        return result;
    }

    public static void main(String[] args) {
        int radius = 7;
        int height = 9;

        double V = Math.PI * square(radius)*height;
        double S = 2 * Math.PI * radius * (radius + height);

        System.out.println("The Volume of a cylinder is: " + V + "; \nRound value is: " + Math.round(V));
        System.out.println("The Surface of cylinder area is: " + S + "; \nRound value is: " + + Math.round(S));
    }
}