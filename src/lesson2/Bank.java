package lesson2;
// Сколько вернет денег банк, если 10 000 руб. положить в банк под 7% годовых, и забрать их через 20 лет?
// верное решение
public class Bank {
    public static void main(String[] args) {
        int year = 20;
        int persent = 7;
        double money = 10000;

        for (int i = 0; i < year; i++) {
            money = money + (money / 100 * persent);
        }
        System.out.println(money);
    }
}
