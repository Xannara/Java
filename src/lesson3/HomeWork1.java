package lesson3;
// вычислить сумму всех чисел в массиве
public class HomeWork1 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 1, 7, 3};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
