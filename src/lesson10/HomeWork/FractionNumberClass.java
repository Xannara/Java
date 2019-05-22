package lesson10.HomeWork;

public class FractionNumberClass implements FractionNumber{
    private int dividend;
    private int divisor = 1;

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public void setDivisor(int divisor) {
        if (divisor == 0) {
            System.out.println("IllegalArgumentException");
            System.out.println("Введите число, не равное 0");
            System.exit(0);
        } else {
            this.divisor = divisor;
        }
    }

    public int getDivisor() {
        return this.divisor;
    }

    public int getDividend() {
        return dividend;
    }

    public double value() {
        double div1 = (double) dividend;
        double div2 = (double) divisor;
        double dResult = div1 / div2;
    //    System.out.println(dResult);
        return dResult;
    }

    public String toString() {
        String number = ("");
        int i = (int) dividend;
        int j = (int) divisor;
        System.out.printf("%d/%d", i, j);
        return number;
    }

    public void printInfo() {
        System.out.printf("%d/%d", dividend, divisor);
        System.out.println();
    }
}
