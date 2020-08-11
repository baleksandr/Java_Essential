package Lesson_7;

import java.util.Scanner;

public class Conversion {
    static double USD() {
        return 27.72;
    }

    static double EUR() {
        return 32.63;
    }

    static double UAN() {
        return 27.6;
    }

    static double RUB() {
        return 0.374;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Текущий курс валют:\n UAN: 27,5; USD: 27,72; EUR: 32,61; RUB: 0,38;");
        System.out.println("Выберите валюту:\n 1: UAH, 2: USD, 3: EUR, 4: RUB");
        String currency = sc.next();
        System.out.println("Выберите сумму для конвертации: ");
        int amount = sc.nextInt();


        switch (currency) {
            case "1": {
                double a = USD();
                System.out.println("Суммуа UAN: " + amount + "; Результат USD: " + String.format("%.3g%n", amount / a));
                double b = EUR();
                System.out.println("Суммуа UAN: " + amount + "; Результат EUR: " + String.format("%.3g%n", amount / b));
                double c = RUB();
                System.out.println("Суммуа UAN: " + amount + "; Результат RUB: " + String.format("%.3g%n", amount / c));
                break;
            }
            case "2": {
                double a = UAN();
                System.out.println("Суммуа USD: " + amount + "; Результат UAN: " + (amount * a));
                System.out.println("Суммуа USD: " + amount + "; Результат EUR: " + (amount * 0.84));
                System.out.println("Суммуа USD: " + amount + "; Результат RUB: " + (amount * 73.03));
                break;
            }
            case "3": {
                double a = EUR();
                System.out.println("Суммуа EUR: " + amount + "; Результат UAN: " + (amount * a));
                System.out.println("Суммуа EUR: " + amount + "; Результат USD: " + String.format("%.3g%n", amount * 1.18));
                System.out.println("Суммуа EUR: " + amount + "; Результат RUB: " + String.format("%.3g%n", amount * 86.00));
                break;
            }
            case "4": {
                double a = RUB();
                System.out.println("Суммуа RUB: " + amount + "; Результат UAN: " + (amount * a));
                System.out.println("Суммуа RUB: " + amount + "; Результат USD: " + String.format("%.2g%n", amount * 0.014));
                System.out.println("Суммуа RUB: " + amount + "; Результат EUR: " + String.format("%.2g%n", amount * 0.012));
                break;
            }
        }
    }
}