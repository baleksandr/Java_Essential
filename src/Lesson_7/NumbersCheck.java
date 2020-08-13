package Lesson_7;

import java.util.Scanner;

public class NumbersCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        numberRate(number);
        isNumberIsSimple(number);
        checkNumbers(number);
    }

    public static void numberRate(int number) {
        if (number > 0) {
            System.out.println("First task: Number is positive");
        } else if (number < 0) {
            System.out.println("First task: Number negative");
        } else
            System.out.println("First task: number negative equals = " + number);
    }

    public static void isNumberIsSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Second Task: This number is not simple!!!");
            }
        }
        System.out.println("Second Task: Very well! It's simple!");
    }

    public static void checkNumbers(int number) {
        if (number%2==0 && number%5==0 && number%3==0 && number%6==0 && number%9==0) {
            System.out.println("Third task: " + number + " Very well! You found a number that is Divisible by" +
                    " 2, 5, 3, 6, 9 without residue");
        }
        System.out.println("Third task: " + number + " is not divisible by one of the numbers without remainder");
    }
}
