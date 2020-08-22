package JavaStarter.HomeWork_8;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customers amount: ");
         int customers = sc.nextInt();

        int sum = cust(customers);
        System.out.println("Количество доставок одной машиной: " + sum);
    }

    static int cust (int a) {
        if (a == 0)
            return 1;
        else
            return a * cust(a - 1);
    }
}