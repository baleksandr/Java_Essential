package HomeWork_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 4;
        int operand2 = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите знак арифметической операции: ");
        String sign = sc.next(); // Вводим знак

        switch (sign) {
            case "+": {
                System.out.println("Sum of adding numbers: " + operand1 + " " + sign + " " + operand2 + " = " + (operand1 + operand2));
                break;
            }
            case "-": {
                System.out.println("Subtraction of numbers: " + operand1 + sign + operand2 + " = " + (operand1 - operand2));
                break;
            }
            case "*": {
                System.out.println("Multiplication of numbers: " + operand1 + sign + operand2 + " = " + (operand1 * operand2));
                break;
            }
            case "/": {
                System.out.println("Division of numbers: " + operand1 + sign + operand2 + " = " + (operand1 / operand2));
                break;
            }
            default: {
                System.out.println("The given arithmetic operator was not found. Please try again! ");

            }
        }
    }
}