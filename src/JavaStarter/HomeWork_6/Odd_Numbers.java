package JavaStarter.HomeWork_6;

public class Odd_Numbers {
    public static void main(String[] args) {
        int min = 1;
        int max = 26;

        for (int i = (min + 1); i < max; i++) {
            if (i % 2 != 0) {
                System.out.println("Нечетное число = " + i);
            }
        }

    }
}
