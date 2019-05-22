package lesson11.HomeWork;
//проверка метода remove()  - удаление элемента из коллекции
import java.util.ArrayList;
import java.util.LinkedList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i =0; i < 100000; i++) {
            arrayList.add(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i =0; i < 100000; i++) {
            linkedList.add(i);
        }

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("ArrayList add: " + (startTime2 - startTime1));
        System.out.println("----------");
        System.out.println("LinkedList add: " + (endTime - startTime2));
        System.out.println();
    }
}
