package Lesson_7;

import java.util.Scanner;

public class Calculator {
    public static int add (int a, int b, int c) {
        return (a + b + c)/3;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the first (integer) number: ");
//        int first = sc.nextInt(); // Вводим первое целое число
//
//        System.out.println("Enter the second (integer) number: ");
//        int second = sc.nextInt(); // Вводим второе целое число
//
//        System.out.println("Enter the third (integer) number: ");
//        int third = sc.nextInt(); // Вводим третее целое число
//
//        int sum = add(first, second, third);
        System.out.println("The average of 3 numbers: " + add(2,3,5));
    }
}