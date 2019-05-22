package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(20);
        numbers.add(404);
        numbers.add(15);
        numbers.add(90);
        numbers.add(1);
        numbers.add(20);    // дубликаты не сохраняются

        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println();


        LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>();     // выводит числа по порядку вхождения
        numbers1.add(4);
        numbers1.add(20);
        numbers1.add(404);
        numbers1.add(15);
        numbers1.add(90);
        numbers1.add(1);
        numbers1.add(20);    // дубликаты не сохраняются

        for (Iterator<Integer> iter = numbers1.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }


}
