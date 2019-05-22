package lesson3;
// вывести на консоль массив в обратном порядке
public class HomeWork3 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 1, 7, 3, 8};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
