package HomeWork_6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        int customers;
        int car = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customers amount: ");
        customers = sc.nextInt();

        do {
            car *= customers--;
        } while (customers > 0);

        System.out.println("There are " + car + " possible routes for delivering goods to customers.");
    }
}