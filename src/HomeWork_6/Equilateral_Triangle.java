package HomeWork_6;

import java.util.Scanner;

public class Equilateral_Triangle {
    public static void main(String[] args) {
        int i, space, width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of Triangle");
        width = sc.nextInt();

        for (i = 1; i <= width; i++) {
            for (space = i; space <= width; space++) {
                System.out.print(" ");
            }
            for (space = 1; space < i; space++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(" ");
        }
    }
}