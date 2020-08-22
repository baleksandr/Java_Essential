package JavaStarter.HomeWork_6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int height;
        int width;

        Scanner sc = new Scanner(System.in);
        System.out.println("Specify the height of the shape: ");
        height = sc.nextInt();
        System.out.println("Specify the length of the shape: ");
        width = sc.nextInt();

        for(int i = 0; i < height; i++) {
            for (int b = 0; b < width; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}