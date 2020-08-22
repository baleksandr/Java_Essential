package JavaStarter.HomeWork_5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();

        if ((n > 0) && ((n & (n - 1)) == 0)) {
            System.out.println("YES - Число является степенью (2)");
        } else {
            System.out.println("NO - Число не является степенью (2)");
        }
    }
}