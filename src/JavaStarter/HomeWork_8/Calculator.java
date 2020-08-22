package JavaStarter.HomeWork_8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 целочисленных значения: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] result = div(n1, n2, n3);
        System.out.println("Значение чисел: " + n1 + " + " + n2 + " + " + n3 + " деленных на (5) = " +
                result[0] + "; " + result[1] + "; " + result[2] + ";");
    }

    static int[] div(int one, int two, int three) {
        int a = one / 5;
        int b = two / 5;
        int c = three / 5;

        return new int[]{a, b, c};
    }
}
