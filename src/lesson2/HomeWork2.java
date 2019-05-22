package lesson2;
// вывести на числа в диапазоне от 500 до 1000, которые делятся без остатка на 7 и на 19
public class HomeWork2 {
    public static void main(String[] args) {
        for (int i = 150; i < 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                System.out.println(i);
            }
        }
    }
}