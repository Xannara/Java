package lesson2;
// вывести числа от 0 до 150, делящиеся на 2 и на 3
public class ClassWork9 {
    public static void main(String[] args) {
        for (int i = 0; i < 150; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
