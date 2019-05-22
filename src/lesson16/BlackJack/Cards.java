package lesson16.BlackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Cards {
    ArrayList<Card> cards = new ArrayList<>();

    public Cards() {
        Card card1 = new Card("Двойка треф", 2);
        Card card2 = new Card("Двойка бубен", 2);
        Card card3 = new Card("Двойка червей", 2);
        Card card4 = new Card("Двойка пик", 2);

        Card card5 = new Card("Тройка треф", 3);
        Card card6 = new Card("Тройка бубен", 3);
        Card card7 = new Card("Тройка червей", 3);
        Card card8 = new Card("Тройка пик", 3);

        Card card9 = new Card("Четверка треф", 4);
        Card card10 = new Card("Четверка бубен", 4);
        Card card11 = new Card("Четверка червей", 4);
        Card card12 = new Card("Четверка пик", 4);

        Card card13 = new Card("Пятерка треф", 5);
        Card card14 = new Card("Пятерка бубен", 5);
        Card card15 = new Card("Пятерка червей", 5);
        Card card16 = new Card("Пятерка пик", 5);

        Card card17 = new Card("Шестерка треф", 6);
        Card card18 = new Card("Шестерка бубен", 6);
        Card card19 = new Card("Шестерка червей", 6);
        Card card20 = new Card("Шестерка пик", 6);

        Card card21 = new Card("Семерка треф", 7);
        Card card22 = new Card("Семерка бубен", 7);
        Card card23 = new Card("Семерка червей", 7);
        Card card24 = new Card("Семерка пик", 7);

        Card card25 = new Card("Вссьмерка треф", 8);
        Card card26 = new Card("Вссьмерка бубен", 8);
        Card card27 = new Card("Вссьмерка червей", 8);
        Card card28 = new Card("Вссьмерка пик", 8);

        Card card29 = new Card("Девятка треф", 9);
        Card card30 = new Card("Девятка бубен", 9);
        Card card31 = new Card("Девятка червей", 9);
        Card card32 = new Card("Девятка пик", 9);

        Card card33 = new Card("Десятка треф", 10);
        Card card34 = new Card("Десятка бубен", 10);
        Card card35 = new Card("Десятка червей", 10);
        Card card36 = new Card("Десятка пик", 10);

        Card card37 = new Card("Валет треф", 10);
        Card card38 = new Card("Валет бубен", 10);
        Card card39 = new Card("Валет червей", 10);
        Card card40 = new Card("Валет пик", 10);

        Card card41 = new Card("Дама треф", 10);
        Card card42 = new Card("Дама бубен", 10);
        Card card43 = new Card("Дама червей", 10);
        Card card44 = new Card("Дама пик", 10);

        Card card45 = new Card("Король треф", 10);
        Card card46 = new Card("Король бубен", 10);
        Card card47 = new Card("Король червей", 10);
        Card card48 = new Card("Король пик", 10);

        Card card49 = new Card("Туз треф", 11);
        Card card50 = new Card("Туз бубен", 11);
        Card card51 = new Card("Туз червей", 11);
        Card card52 = new Card("Туз пик", 11);


        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
        cards.add(card37);
        cards.add(card38);
        cards.add(card39);
        cards.add(card40);
        cards.add(card41);
        cards.add(card42);
        cards.add(card43);
        cards.add(card44);
        cards.add(card45);
        cards.add(card46);
        cards.add(card47);
        cards.add(card48);
        cards.add(card49);
        cards.add(card50);
        cards.add(card51);
        cards.add(card52);

    }
  // достать любые две карты из колоды
    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51);
        return cards.get(randomNum);
    }
}
