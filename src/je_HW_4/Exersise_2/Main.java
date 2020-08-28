package je_HW_4.Exersise_2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler doc = new DOCHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler xml = new XMLHandler();

        doc.open();
        txt.change();
        xml.create();
        xml.save();
    }
}