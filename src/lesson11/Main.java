package lesson11;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> texts = new ArrayList<>();
        texts.add("qwerty");
        texts.add("asdfgh");
        texts.add("zxcvbn");
        texts.add(0,"tyuiop");
        texts.set(1, "ghjkl");

// проход по коллекции 1 способ
        for (String str: texts) {
            System.out.println(str);
        }
        System.out.println(texts.size());
        System.out.println("********");

// проход по коллекции 2 способ
        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }

// проход по коллекции 3 способ
        System.out.println("********");
        for (Iterator<String> iter = texts.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
