package lesson4;
// Есть строка "London is a capital of the great britain"
// Вывести на консоль весь текст задом на перед
public class HomeWork3 {
    public static void main(String[] args) {
        String str = "London is a capital of the great britain";
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println("Строка в обратном порядке: " + reverse);
    }
}
