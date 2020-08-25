package JavaStarter.HomeWork_9;

public class ArraysSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 45) - 10);;
            length++;
        }

        for (int value : array) {
            System.out.println(value);
        }

        for (int i = length -1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
