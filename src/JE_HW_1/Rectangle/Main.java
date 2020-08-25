package JE_HW_1.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: \nВысоту и Длину: \n");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        Rectangle shape = new Rectangle();

        shape.setSide1(s1);
        shape.setSide2(s2);

        shape.areaCalculator();
        shape.perimeterCalculator();
    }
}