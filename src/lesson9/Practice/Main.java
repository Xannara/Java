package lesson9.Practice;

public class Main {
    public static void main(String[] args) {
        Kiwi kiwi = new Kiwi();
        Apple apple = new Apple();
        Fruits fruits = new Fruits();

        System.out.println(kiwi);
        System.out.println(apple);
        System.out.println(fruits);
        System.out.println();

        // если нужно использовать разные типы данных
        Fruits [] fruits1 = new Fruits[2];
        fruits1[0] = kiwi;
        fruits1[1] = apple;

        for (Fruits f: fruits1) {
            System.out.println(f);
        }
    }
}
