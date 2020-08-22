package JavaStarter.HomeWork_8;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Взятая сумма кредита = 1000$, \nВведите сумму погашения кредита: ");
        int amount = sc.nextInt();
        final int credit = 1000;
        int result = 0;

        if (amount >= credit) {
            System.out.println("Ваш кредит погашен!!! и сумма перплаты составляет: " + ~(amount - credit) + "$");
        } else {
            for (int i = 1; i < 100; i++) {
                result += amount;
                System.out.println("Количество платижей: " + i);
                if (result >= credit) {
                    System.out.println("Ваш кредит погашен!!! \nСумма перплаты составляет: " + (result - credit) + "$");
                    break;
                } else {
                    System.out.println("Кредит не погашен! \nСумма задолжности составляет: " + (credit - result) + "$");
                    System.out.println("Введите сумму $ для погашения кредита: ");
                    amount = sc.nextInt();
                }
            }
        }
        System.out.println("Спасибо, что воспользовались услугами нашего Банка!!!");
    }
}