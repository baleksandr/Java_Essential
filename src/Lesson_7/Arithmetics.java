package Lesson_7;

import java.util.Scanner;

public class Arithmetics {
    static int add(int sum1, int sum2) {
        return sum1 + sum2;
    }
    static int sub(int sum1, int sum2) {
        return sum1 - sum2;
    }
    static int mul(int sum1, int sum2) {
        return sum1 * sum2;
    }

    static double div(double sum1, double sum2) {
        return sum1 / sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый аргумент: ");
        int amount1 = sc.nextInt();
        System.out.println("Введите второй аргумент: ");
        int amount2 = sc.nextInt();
        System.out.println("Введите знак арифметической операции: ");
        String sign = sc.next();


        switch (sign) {
            case "+": {
                int sum = add(amount1, amount2);
                System.out.println("Значение чисел = " + sum);
                break;
            }
            case "-": {
                int sum = sub(amount1, amount2);
                System.out.println("Значение чисел = " + sum);
                break;
            }
            case "*": {
                int sum = mul(amount1, amount2);
                System.out.println("Значение чисел = " + sum);
                break;
            }
            case "/": {
                try {
                    if (amount2 != 0) {
                        double sum = div(amount1, amount2);
                        System.out.println("Значение чисел = " + sum);
                    } else {
                        System.out.println("Деление на 0 запрещено!!!");
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Деление на 0 запрещено!?");
                }
                break;
            }
        }
    }
}