package lesson11;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1, 1900);
        Coin coin2 = new Coin(5, 1, 1900);
        Coin coin3 = new Coin(7, 3, 1920);
        Coin coin4 = new Coin(15, 10, 1906);
        Coin coin5 = new Coin(10, 15, 1935);

        HashSet<Coin> coins = new HashSet<>();
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
