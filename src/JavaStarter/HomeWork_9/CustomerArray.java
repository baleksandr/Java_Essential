package JavaStarter.HomeWork_9;

public class CustomerArray {
    public static void main(String[] args) {
        int[] list = {1, 3, -7, 2, 8, -23, 21, 54, 4, 5, -33};
        // Вывод масива
        for (int item : list) {
            System.out.print(item + " ");
        }

        amountMax(list);
        amountMin(list);
        averAmount(list);
    }

    // Максимальное значение
    private static void amountMax(int[] list) {
        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("\nMax amount is: " + max);
    }

    // Минимальное значение
    private static void amountMin(int[] list) {
        int min = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println("Min amount is: " + min);
    }

    // Сумма чисел, Среднее значение, Вывод всех нечетных чисел
    private static void averAmount(int[] list) {
        int sum = 0;
        int average = 0;

        for (int value : list) {
            sum += value;
            average = sum / list.length;
            if (value < 0)
                System.out.print("Число из списка не четное " + value + "\n");
        }
        System.out.println("Сумма всех чисел = " + sum);
        System.out.println("Среднее значение всех чисел = ~" + average);
    }
}