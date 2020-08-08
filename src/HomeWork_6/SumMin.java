package HomeWork_6;

public class SumMin {
    public static void main(String[] args) {
        int min = 3;
        int max = 9;
        int sum = 0;

        for (int i = (min + 1); i < max; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел между min " + min + " и " + max + " = " + sum);
    }
}
