package JavaStarter.HomeWork_9;

public class ReversedArray {
    public static void main(String[] args) {
        int[] list = ReversedArray.myReverse(new int[]{1, 3, -7, 2, 8, -23, 21, 54, 4, 5, -33});

        for (int value : list) {
            System.out.print(value + ", ");
        }
    }

    public static int[] myReverse(int[] array) {
        int[] a = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            a[j] = array[i];

        }
        return a;
    }
}
