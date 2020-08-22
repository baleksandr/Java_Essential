package JavaStarter.HomeWork_6;

public class Triangle {
    public static void main(String[] args) {
        // Variant 1
//        int a = 1;
//        for (int i = 0; i < 11; i++){
//            for (int b = 1; b < a ; b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            a++;
//        }

        // Variant 2
        int height = 12;
        int width = 1;
        for (int i = 0; i < height; i++) {
            for (int b = 1; b < width; b++) {
                System.out.print("*");
            }
            System.out.println();
            width++;
        }
    }
}
