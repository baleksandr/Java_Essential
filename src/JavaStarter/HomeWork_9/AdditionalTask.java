package JavaStarter.HomeWork_9;

import java.util.Arrays;

public class AdditionalTask {
    public static void main(String[] args) {
        int[] listNum = {1, 3, -7, 2, 8, -23, 21, 54, 4, 5, -33};

        String[] friendsName = {"Петр", "Ричард", "Рудольф", "Артем", "Семен"};
        // Выводим имена
        for (String value : friendsName) {
            System.out.print(value + " ");
        }

        int[] num2 = {4, 5, 6};
        int[] num1 = {1, 2, 3};
        int toCheckValue = -23;
        array(num1, num2);
        sort(listNum);
        addCount(friendsName);
        minMaxAmount(listNum);
        check(toCheckValue, listNum);

    }

    private static void sort(int[] list) {
        //Сортировка
        Arrays.sort(list);

        for (int sortNum : list) {
            System.out.print("Сортировка " + sortNum + " ");
        }
        System.out.println();
    }

    // Выводим 0.Name
    private static void addCount(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + ". ") + list[i]);
        }
        System.out.println();
    }

    //Объединение масивов
    private static void array(int[] num1, int[] num2) {
        int[] num3 = new int[num1.length + num2.length];

        int amount = 0;
        for (int a : num1) {
            num3[amount] = a;
            amount++;
        }
        for (int b : num2) {
            num3[amount] = b;
            amount++;
        }
        for (int item : num3) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Минимальное значение
    // Максимальное значение
    private static void minMaxAmount(int[] list) {
        int tempMin = list[0];
        int tempMax = list[0];
        int sum = 0;
        int average = 0;

        for (int i = 1; i < list.length; i++) {
            if (list[i] < tempMin) {
                tempMin = list[i];
            }
            if (list[i] > tempMax) {
                tempMax = list[i];
            }
            //Среднее значение
            for (int number : list) {
                sum += number;
                average = sum / list.length;
            }
        }
        System.out.println("\nМинимальное значение: " + tempMin + "\nMаксимальное значение: " + tempMax +
                "\nСреднее значение: " + average);

        System.out.println("Array: " + Arrays.toString(list) + "\n");
    }

    // Проверка присутствие элемента в масиве
    private static void check(int toCheckValue, int[] list) {
        int tempNumber;
        for (int i = 1; i < list.length; i++) {
            if (list[i] == toCheckValue) {
                tempNumber = toCheckValue;
                System.out.println(tempNumber + " = Is present in the array ");
            }
        }
    }
}