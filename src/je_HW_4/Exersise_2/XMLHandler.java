package je_HW_4.Exersise_2;

public class XMLHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открытие текста в xml. формате");
    }

    @Override
    void create() {
        System.out.println("Создание текста в xml. формате");
    }

    @Override
    void change() {
        System.out.println("Изменене текста в xml. формате");
    }

    @Override
    void save() {
        System.out.println("Сохранение текста в xml. формате");
    }
}