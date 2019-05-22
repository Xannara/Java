package lesson2;
// Сколько вернет денег банк, если 10 000 руб. положить в банк под 7% годовых, и забрать их через 20 лет?
public class HomeWork8 {
    public static void main(String[] args) {
        int sum = 10000;                            // начальная сумма
        int percent = 7;                            // процент, под который кладутся деньги
        int totalPercent = (sum / 100) * percent;   // процент от начальной суммы
        int tot = 0;                                // процент от начальной суммы за 20 лет
        int total = 0;                              // вспомогательная переменная для присваивания в цикле
        int totalSum = 0;                           // итоговая сумма
        for (int i = 1; i <= 20; i++) {
            tot = totalPercent * i;
            total = tot;
        }
        totalSum = sum + total;
        System.out.println("Итоговая сумма составит " + totalSum + " руб.");
    }
}
