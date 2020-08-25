package JavaStarter.HomeWork_5;

public class DeMorganComparison {
    //  Исходное выражение                           Эквивалентное выражение
    //     !A & !B                       =                  !(A | B)
    //     !A & B                        =                  !(A | !B)
    //     A & !B                        =                  !(!A | B)
    //     A & B                         =                  !(!A | !B)
    //     !A | !B                       =                  !(A & B)
    //     !A | B                        =                  !(A & !B)
    //     A | !B                        =                  !(!A & B)
    //     A | B                         =                  !(!A & !B)

    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        if (A | B) {
            System.out.println("Исходное выражение A | B  по теореме Де Моргана имеем: " + (A | B));
        } else {
            System.out.println("Исходное выражение A | B  по теореме Де Моргана имеем: " + (A | B));
        }

        if (!(!A & !B)) {
            System.out.println("Эквивалентное выражение !(!A & !B)  по теореме Де Моргана имеем: " + (!(!A | !B)));
        } else {
            System.out.println("Эквивалентное выражение !(!A & !B)  по теореме Де Моргана имеем: " + (!(!A | !B)));
        }
    }
}