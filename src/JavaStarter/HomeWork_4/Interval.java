package JavaStarter.HomeWork_4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число в области знаяения: ");
        int number = sc.nextInt(); // Вводим число

        int a = 14, c = 35, e = 50, f = 100;

        String gap;

        gap = number >= 0 ? ((number <= a) ? " Диапозон числа от [0 - 14]" : ((number <= c)  ? "Диапозон числа  от [15 - 35]" :
                ((number == e)  ? "Диапозон числа от [36 - 50] и [50 - 100]" : ((number <= e) ? "Диапозон числа  от [36 - 50]" :
                        ((number <= f) ? "Диапозон числа  от [50 - 100]" : "Число не входит в границы от 0 до 100"))))) : "Число не входит в границы от 0 до 100";

        System.out.println(gap);
    }
}