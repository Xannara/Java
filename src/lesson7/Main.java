package lesson7;
// работа с методом "дробное число"
public class Main {
    public static void main(String[] args) {
        DrobnoeChislo chislo1 = new DrobnoeChislo();
        DrobnoeChislo chislo2 = new DrobnoeChislo();

        chislo1.setChislitel(3);
        chislo1.setZnamenatel(5);

        chislo2.setChislitel(7);
        chislo2.setZnamenatel(2);

        Calc calc = new Calc();
        DrobnoeChislo result = calc.summa(chislo1, chislo2);

        result.printInfo();
    }
}
