package je_HW_4.Exersise_2;

public class TXTHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открытие текста в txt. формате");
    }

    @Override
    void create() {
        System.out.println("Создание текста в txt. формате");
    }

    @Override
    void change() {
        System.out.println("Изменене текста в txt. формате");
    }

    @Override
    void save() {
        System.out.println("Сохранение текста в txt. формате");
    }
}