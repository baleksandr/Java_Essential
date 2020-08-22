package JavaStarter.HomeWork_8;

import java.util.Scanner;

public class Bank1 {
    public static void main(String[] args) {
        pay(100, 1000);
    }

    public static void pay(int sum, int credit) {
        Scanner sc = new Scanner(System.in);

        if (sum == credit) {
            System.out.println("Кредит погашен!!!!!!");
        } else if (sum > credit) {
            System.out.println("Ваш кредит погашен!!! и сумма перплаты составляет: " + (sum - credit) + "$");
        } else {
            System.out.println("Кредит не погашен! \nСумма задолжности составляет: " + (credit - sum) + "$");
            int amount = sc.nextInt();
            pay(amount, credit - sum);
        }
    }
}