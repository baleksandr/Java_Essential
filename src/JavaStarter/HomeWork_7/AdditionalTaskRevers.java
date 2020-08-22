package JavaStarter.HomeWork_7;

import java.util.Scanner;

public class AdditionalTaskRevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число: ");
        String number = sc.next();
        String sum = revers(number);
        System.out.println("Обратное значение чисел = " + sum);
    }

    public static String revers(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
}

