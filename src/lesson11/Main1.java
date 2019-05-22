package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("sksk" + 1);
        }

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("sksk" + 1);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("ArrayList add: " + (startTime2 - startTime1));
        System.out.println("----------");
        System.out.println("LinkedList add: " + (endTime - startTime2));
        System.out.println();




        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("ArrayList add: " + (startTime4 - startTime3));
        System.out.println("----------");
        System.out.println("LinkedList add: " + (endTime1 - startTime4));
    }
}
