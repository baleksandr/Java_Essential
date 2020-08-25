package JE_HW_1.Computer;

public class Main {
    public static void main(String[] args) {
        Computer[] computer = new Computer[5];

        for (int i = 0; i < 5; i++) {
            computer[i] = new Computer();
            computer[i].setMemory("detail_" + i);
        }

        for (Computer amount : computer ) {
            System.out.println("detail: " + amount.getMemory());
        }
    }
}
