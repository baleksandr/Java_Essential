package je_HW_4.Exersise_3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Я могу проигрывать музыку");
    }

    @Override
    public void record() {
        System.out.println("Я могу записывать музыку");
    }

    @Override
    public void pause() {
        System.out.println("Я могу ставить на паузу музыку");
    }

    @Override
    public void stop() {
        System.out.println("Я могу останавливать музыку");
    }
}