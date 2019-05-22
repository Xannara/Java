package lesson11.HomeWork;
// проверка метода max() - находит максимальный элемент в коллекции
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i =0; i < 1000; i++) {
            arrayList.add(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i =0; i < 1000; i++) {
            linkedList.add(i);
        }

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Collections.max(arrayList);
        }

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Collections.max(linkedList);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("ArrayList add: " + (startTime2 - startTime1));
        System.out.println("----------");
        System.out.println("LinkedList add: " + (endTime - startTime2));
        System.out.println();
    }
}
