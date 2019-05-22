package lesson4;
// Есть строка "London is a capital of the great britain"
// Вывести на консоль по одному слову в каждой строчке
public class HomeWork2 {
    public static void main(String[] args) {
        String str = "London is a capital of the great britain";
        String [] words = str.split("\\s");  // Разбиение строки на слова с помощью разграничителя (пробел)

        for (String subStr:words) {
            System.out.println(subStr);
        }
    }
}
