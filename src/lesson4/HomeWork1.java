package lesson4;
// Есть строка "London is a capital of the great britain"
// Вывести на консоль через букву
public class HomeWork1 {
    public static void main(String[] args) {
        String str = "London is a capital of the great britain";
        String result = " ";

        for (int i = 1; i < str.length(); i+=2) {
            result = result + str.charAt(i);
        }
        System.out.println(result);

    }
}
