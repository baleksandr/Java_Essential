package HomeWork_5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
//        Если выслуга до 5 лет, премия составляет 10% от заработной платы.
//        Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
//        Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
//        Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
//        Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
//        Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество выслуги лет: ");
        int years = sc.nextInt(); // Вводим число
        System.out.println("Введите вашу зарплату: ");
        int salary = sc.nextInt(); // Вводим число

        int a = 0, b = 5, c = 10, d = 15, e = 20, f = 25;
        double premium;

        if (a < years && years < b) {
//            premium = (salary * 10) / 100; // Без преобразования "premium" к double
            premium = salary * 0.10;
            System.out.println("Ваша выслуга до 5 лет и вы получите 10% премии.");
            System.out.println("Зарплата: " + salary + " + премия 10%" + " = " + (salary + premium));
        } else if (b <= years && years < c) {
            premium = salary * 0.15;
            System.out.println("Ваша выслуга от 5 до 10 лет и вы получите 15% премии.");
            System.out.println("Зарплата: " + salary + " + премия 15%" + " = " + (salary + premium));
        } else if (c <= years && years < d) {
            premium = salary * 0.25;
            System.out.println("Ваша выслуга от 10 до 15 лет и вы получите 25% премии.");
            System.out.println("Зарплата: " + salary + " + премия 25%" + " = " + (salary + premium));
        } else if (d <= years && years < e) {
            premium = salary * 0.35;
            System.out.println("Ваша выслуга от 15 до 20 лет и вы получите 35% премии.");
            System.out.println("Зарплата: " + salary + " + премия 35%" + " = " + (salary + premium));
        } else if (e <= years && years < f & years != f) {
            premium = salary * 0.45;
            System.out.println("Ваша выслуга от 20 до 25 лет и вы получите 45% премии.");
            System.out.println("Зарплата: " + salary + " + премия 45%" + " = " + (salary + premium));
        } else {
            premium = salary * 0.50;
            System.out.println("Ваша выслуга больше 25 лет и вы получите 50% премии.");
            System.out.println("Зарплата: " + salary + " + премия 50%" + " = " + (salary + premium));
        }
    }
}