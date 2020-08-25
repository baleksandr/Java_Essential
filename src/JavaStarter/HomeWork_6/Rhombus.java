package JavaStarter.HomeWork_6;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {
        int i, space, width;
        int starsAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify the height of the shape: ");
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
            starsAmount++;
        }
        for (i = starsAmount; i <= width; i--) {
            for (space = i; space <= width; space++) {
                System.out.print(" ");
            }
            for (space = 1; space < i; space++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(" ");
            if (i == 0){
                break;
            }
        }
    }
}
