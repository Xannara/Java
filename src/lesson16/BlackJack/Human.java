package lesson16.BlackJack;

import java.util.Scanner;

public class Human extends Player {
    @Override
    public boolean doAction() {
        System.out.println("Ваши действия?");
        System.out.println("любая клавиша - не брать карту");
        System.out.println("1 - взять еще карту");
        Scanner sc = new Scanner(System.in);
        String humanInput = sc.nextLine();
        if (humanInput.equals("1")) {
            return true;
        }
        this.setContinue(false);
        return false;
    }

    @Override
    public String toString() {
        return "Human " + getPoints();
    }
}
