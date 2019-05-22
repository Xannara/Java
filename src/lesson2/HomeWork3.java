package lesson2;
// вывести сумму чисел в диапазоне от 50 до 1000, которые делятся без остатка на 7 и на 19
public class HomeWork3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 50; i < 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
