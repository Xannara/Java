package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class MainCollectionUtils {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(9);
        a.add(9);
        a.add(2);
        a.add(3);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        b.add(19);
        b.add(9);
        b.add(1);
        b.add(8);
        b.add(5);

        CollectionUtilsImpl utils1 = new CollectionUtilsImpl();
        Collection<Integer> union = utils1.union(a, b);
        System.out.println("Объединение коллекций с дубликатами: ");
        System.out.println(union);
        System.out.println();

        CollectionUtilsImpl utils2 = new CollectionUtilsImpl();
        Collection<Integer> intersection = utils2.intersection(a, b);
        System.out.println("Пересечение коллекций с дубликатами: ");
        System.out.println(intersection);
        System.out.println();

        CollectionUtilsImpl utils3 = new CollectionUtilsImpl();
        Collection<Integer> unionWithoutDuplicate = utils3.unionWithoutDuplicate(a, b);
        System.out.println("Объединение коллекций без дубликатов: ");
        System.out.println(unionWithoutDuplicate);
        System.out.println();

        CollectionUtilsImpl utils4 = new CollectionUtilsImpl();
        Collection<Integer> intersectionWithoutDuplicate = utils4.intersectionWithoutDuplicate(a, b);
        System.out.println("Пересечение коллекций без дубликатов: ");
        System.out.println(intersectionWithoutDuplicate);
        System.out.println();

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> difference = utils.difference(a, b);
        System.out.println("Разность коллекций: ");
        System.out.println(difference);
    }
}
