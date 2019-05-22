package lesson5;
// Вывести на консоль по одному слову в каждой строчке
public class HomeWork5 {
    public static void consoleSting (String str) {
        String [] words = str.split("\\s");  // Разбиение строки на слова с помощью разграничителя (пробел)

        for (String subStr:words) {
            System.out.println("words: " + subStr);
        }
    }
}
