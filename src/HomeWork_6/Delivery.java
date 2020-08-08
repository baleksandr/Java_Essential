package HomeWork_6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        int car = 1;
        int customers;
        long result = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customers amount: ");
        customers = sc.nextInt();

        do {
            result *= car;
            car++;
        }
        while (car <= customers);
        System.out.println("There are " + result + " possible routes for delivering goods to " + customers + " customers.");
    }
}