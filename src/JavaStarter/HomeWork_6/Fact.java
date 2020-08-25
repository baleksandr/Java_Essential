package JavaStarter.HomeWork_6;

public class Fact {
    public static void main(String[] args) {
        int count = 1;
        int fact = 8;
        long result = 1;

        while (count <= fact){
            result *= count;
            count++;
        }
        System.out.println("Фактариал " + fact + " = " + result);
    }
}
