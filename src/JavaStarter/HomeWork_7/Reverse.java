package JavaStarter.HomeWork_7;

public class Reverse {
    public static int sum (int number) {
        int sum=0, n;
        while (number!=0){
            n = number%10;
            sum = sum +n;
            number = number/10;
        }
        return sum;
    }

    public static void reverse (int number) {
        int n;
        while (number!=0){
            n = number%10;
            System.out.print(n+" ");
            number = number/10;
        }
    }

    public static void main(String[] args) {

        reverse(12345);
    }
}