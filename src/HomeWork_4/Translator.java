package HomeWork_4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите Тип погоды: ");
        String weather = sc.next(); // Вводим слово

        switch (weather) {
            case "Снег": {
                System.out.println("The translation of the word is: Snow");
                break;
            }
            case "Ветеренно": {
                System.out.println("The translation of the word is: Windy");
                break;
            }
            case "Дождливо": {
                System.out.println("The translation of the word is: Rainy");
                break;
            }
            case "Туманно": {
                System.out.println("The translation of the word is: Foggy");
                break;
            }
            case "Град": {
                System.out.println("The translation of the word is: Hail");
                break;
            }
            case "Шторм": {
                System.out.println("The translation of the word is: Storm");
                break;
            }
            case "Солнечно": {
                System.out.println("The translation of the word is: Sunny");
                break;
            }
            case "Тучи": {
                System.out.println("The translation of the word is: Cloudy");
                break;
            }
            case "Метель": {
                System.out.println("The translation of the word is: Blizzard");
                break;
            }
            case "Торнадо": {
                System.out.println("The translation of the word is: Tornado");
                break;
            }
            default: {
                System.out.println("Данное слово не найдено.");
            }
        }
    }
}