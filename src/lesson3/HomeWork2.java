package lesson3;
// вычислить сумму всех четных чисел в массиве
public class HomeWork2 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 1, 7, 3, 8};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] % 2 == 0) {
               sum = sum + numbers[i];
           }
        }
        System.out.println(sum);
    }
}
