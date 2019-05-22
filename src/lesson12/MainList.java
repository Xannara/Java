package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qwerty");
        list.add("asdfgh");
        list.add("zxcvbn");
        list.add("yuiop");
        list.add("hjkl");

//первый метод sort
        Collections.sort(list);

        for (String s: list) {
            System.out.println(s);
        }
//второй метод sort
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);                // сортировка наоборот
            }
        });

        for (String s: list) {
            System.out.println(s);
        }
    }
}
