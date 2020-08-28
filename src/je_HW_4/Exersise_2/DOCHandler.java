package je_HW_4.Exersise_2;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Открытие текста в doc. формате");
    }

    @Override
    void create() {
        System.out.println("Создание текста в doc. формате");
    }

    @Override
    void change() {
        System.out.println("Изменене текста в doc. формате");
    }

    @Override
    void save() {
        System.out.println("Сохранение текста в doc. формате");
    }
}
