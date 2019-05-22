package lesson3;
// вывести массив, начиная с последнего элемента
public class ClassWork3 {
    public static void main(String[] args) {
        int [] numbers = {1, 3, 5, 7, 9};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
