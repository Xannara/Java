package lesson12;

import java.util.ArrayList;
import java.util.List;

public class MainListUtils {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("qwerty");
        strings.add("asdfggh");
        strings.add("zxcvbn");
        strings.add("tyuiop");
        strings.add("fghjkl");
        strings.add("xcvbnm");

        ListUtilsImpl utils1 = new ListUtilsImpl();
        List<String> asList = utils1.asList();
        System.out.println(strings);


        List<Double> data = new ArrayList<>();
        data.add(0.5);
        data.add(0.2);
        data.add(0.9);
        data.add(0.1);
        data.add(0.1);
        data.add(0.1);
        data.add(0.54);
        data.add(0.71);
        data.add(0.71);
        data.add(0.71);
        data.add(0.92);
        data.add(0.12);
        data.add(0.65);
        data.add(0.34);
        data.add(0.62);

       ListUtilsImpl utils2 = new ListUtilsImpl();
       List<Double> sortedList = utils2.sortedList(data);
        System.out.println(data);                        // на удивление выводится отсортированный список, не затрагивая начального
    }
}
