package lesson3;
// вывести четные числа в массиве из 10 элементов
public class ClassWork2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int chetNum = 2;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = chetNum;
            chetNum = chetNum + 2;
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
    }
}