package lesson12;

import lesson11.Coin;

import java.util.Comparator;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
// создание внутреннего безымянного класса
            @Override
            public int compare(Coin o1, Coin o2) {
                    int nom1 = o1.getNominal();
                    int nom2 = o2.getNominal();

                    if (o1.getNominal() != o2.getNominal()) {
                        return nom1 - nom2;
                    }
// короткий вариант (без объявления перемнных)
                    if (o1.getYear() != o2.getYear()) {
                        return o1.getYear() - o2.getYear();
                    }
                    return o1.getDiametr() - o2.getDiametr();
                }
        });                     // коллекция, которая сортирует
        Coin coin1 = new Coin(5, 2, 1900);
        Coin coin2 = new Coin(5, 2, 1900);
        Coin coin3 = new Coin(10, 4, 1920);
        Coin coin4 = new Coin(15, 6, 1952);
        Coin coin5 = new Coin(3, 10, 1935);

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c: coins) {
            System.out.println(c);
        }
    }
}
