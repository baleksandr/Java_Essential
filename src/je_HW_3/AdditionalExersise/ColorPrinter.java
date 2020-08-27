package je_HW_3.AdditionalExersise;

public class ColorPrinter extends Printer{
    public void color (String value){
        System.out.println((char) 27 + "[32m" + value);
    }
}
