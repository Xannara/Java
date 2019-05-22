package lesson2;
// c помощью цикла for напечатать на консоль в ряд все цифры от 1 до 20, исключая интервал (не выводя) от 5 до 10
public class HomeWork7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i != 5 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10) {
                Integer.toString(i);                                      // преобразование числа в строку
                System.out.print(i + " ");                                // вывод на консоль в ряд
            }
        }
    }
}
