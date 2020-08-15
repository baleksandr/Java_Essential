package HomeWork_8;

public class Calculator_2 {
    public static void main(String[] args) {
        calculate(17, 34, 345);
    }

    public static void calculate(int n1, int n2, int n3) {
        System.out.println(div5(n1) + " " + div5(n2) + " " + div5(n3));
    }

    public static int div5(int num) {
        return num / 5;
    }
}
