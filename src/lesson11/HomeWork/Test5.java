package lesson11.HomeWork;
// проверка метода sort() - сортировка по алфавиту
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Меркурий");
        arrayList.add("Венера");
        arrayList.add("Земля");
        arrayList.add("Марс");
        arrayList.add("Юпитер");
        arrayList.add("Сатурн");
        arrayList.add("Уран");
        arrayList.add("Нептун");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Меркурий");
        linkedList.add("Венера");
        linkedList.add("Земля");
        linkedList.add("Марс");
        linkedList.add("Юпитер");
        linkedList.add("Сатурн");
        linkedList.add("Уран");
        linkedList.add("Нептун");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Collections.sort(arrayList);
        }

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Collections.sort(linkedList);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("ArrayList add: " + (startTime2 - startTime1));
        System.out.println("----------");
        System.out.println("LinkedList add: " + (endTime - startTime2));
        System.out.println();
    }
}
