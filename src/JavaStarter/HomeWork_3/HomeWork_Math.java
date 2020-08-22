package JavaStarter.HomeWork_3;

public class HomeWork_Math {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        int a = x += y - x++ * z;
        int b = z = --x - y * 5;
        int c = y /= x + 5 % z;
        int d = z = x++ + y * 5;
        int e = z = y - x++ * z;

        System.out.println("a: "+ a + ";\n" + "b: " + b + ";\n" + "c: " + c + ";\n" + "d: " + d + ";\n" + "e: " + e);
    }
}