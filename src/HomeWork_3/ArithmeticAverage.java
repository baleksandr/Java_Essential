package HomeWork_3;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first (integer) number: ");
        int a = sc.nextInt(); // Вводим первое целое число

        System.out.println("Enter the second (fractional) number with (,): ");
        float b = sc.nextFloat(); // Вводим дробное число

        System.out.println("Enter the third number greater than 10"); // Вводим число больше или равно 10

        int c = sc.nextInt();
        while (true) {
            if (c >= 10) {
                System.out.println("The number is correct");
                break;
            } else {
                System.out.println("The number is less the 10, Please enter a new number");
                c = sc.nextInt();
            }
        }
        System.out.println("The average of 3 numbers: \n" + "a: " + a + ";\n" + "b: " + b + ";\n" + "c: " + c + ";\n" + "will be: " + ((a + b + c) / 3));
        System.out.println("Round average of 3 numbers is: " + Math.round((a + b + c) / 3));
    }
}