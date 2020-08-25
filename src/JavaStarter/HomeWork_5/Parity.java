package JavaStarter.HomeWork_5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = sc.nextInt(); // Вводим число

//                                                      Variant #1
//        if (number % 2 == 0) {
//            System.out.println("Число четное = " + number);
//        } else {
//            System.out.println("Число нечетное = " + number);
//        }

//                                                      Variant #2
//        if ((number & 1) != 1) {
//            System.out.println("Число четное = " + number);
//        } else {
//            System.out.println("Число нечетное = " + number);
//        }


//                                                       Variant #3
        boolean b = (number & 1) == 0;
        System.out.println("Число " + number + (b ? " четное." : " нечетное."));
    }
}

