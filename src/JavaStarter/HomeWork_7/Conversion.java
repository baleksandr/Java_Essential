package JavaStarter.HomeWork_7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Текущий курс валют:\n UAN: 27,5; USD: 27,72; EUR: 32,61; RUB: 0,38;");
        System.out.println("Выберите валюту:\n 1: UAH, 2: USD, 3: EUR, 4: RUB");
        String currency = sc.next();
        System.out.println("Выберите сумму для конвертации: ");
        int amount = sc.nextInt();

        numberRate(currency, amount);
    }

    public static void numberRate(String currency, int amount) {
        switch (currency) {
            case "1": {
                System.out.println("Суммуа UAN: " + amount + "; Результат USD: " + String.format("%.3g%n", amount / 27.72));
                System.out.println("Суммуа UAN: " + amount + "; Результат EUR: " + String.format("%.3g%n", amount / 32.63));
                System.out.println("Суммуа UAN: " + amount + "; Результат RUB: " + String.format("%.3g%n", amount / 0.374));
                break;
            }
            case "2": {
                System.out.println("Суммуа USD: " + amount + "; Результат UAN: " + (amount * 27.72));
                System.out.println("Суммуа USD: " + amount + "; Результат EUR: " + (amount * 0.84));
                System.out.println("Суммуа USD: " + amount + "; Результат RUB: " + (amount * 73.03));
                break;
            }
            case "3": {
                System.out.println("Суммуа EUR: " + amount + "; Результат UAN: " + (amount * 32.63));
                System.out.println("Суммуа EUR: " + amount + "; Результат USD: " + String.format("%.5g%n", amount * 1.18));
                System.out.println("Суммуа EUR: " + amount + "; Результат RUB: " + String.format("%.5g%n", amount * 86.00));
                break;
            }
            case "4": {
                System.out.println("Суммуа RUB: " + amount + "; Результат UAN: " + (amount * 0.3744));
                System.out.println("Суммуа RUB: " + amount + "; Результат USD: " + String.format("%.5g%n", amount * 0.014));
                System.out.println("Суммуа RUB: " + amount + "; Результат EUR: " + String.format("%.5g%n", amount * 0.012));
                break;
            }
        }
    }
}