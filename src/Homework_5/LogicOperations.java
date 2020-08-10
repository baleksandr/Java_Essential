package Homework_5;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        int a = x += y >> x++ * z;
        int b = z = ++x & y * 5;
        int c = y /= x + 5 | z;
        int d = x++ & y * 5;
        int e = y << x++ ^ z;

        System.out.println("a: "+ a + ";\n" + "b: " + b + ";\n" + "c: " + c + ";\n" + "d: " + d + ";\n" + "e: " + e + ";");
    }
}