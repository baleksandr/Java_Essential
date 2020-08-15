package HomeWork_7;

import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int amount = sc.nextInt();
        int sum = sumAmount(amount);
        System.out.println("Sum of numbers from " + amount + " is: " + sum);

    }

    static int sumAmount(int sum) {
        int result = 0;
        int min = 0;
        for (int i = (min + 1); i <= sum; i++) {

            result += i;
        }
        return result;
    }
}