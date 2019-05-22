package lesson12;
// сортировка обычных чисел
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(-125);
        numbers.add(5654);
        numbers.add(15615);
        numbers.add(8);
        numbers.add(654);

        for (int n: numbers) {
            System.out.println(n);
        }
    }
}
