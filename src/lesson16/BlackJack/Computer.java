package lesson16.BlackJack;

public class Computer extends Player {
    @Override
    public boolean doAction() {

        if (getPoints() < 16) {
            return true;
        }
        this.setContinue(false);
        return false;
    }

    @Override
    public String toString() {
        return "Computer " + getPoints();
    }
}
