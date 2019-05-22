package lesson10.HomeWork;

public class FractionNumberOperationClass {
    public FractionNumberClass add (FractionNumber a, FractionNumber b) {

        int commonDividend = a.getDividend() + b.getDividend();
        int commonDivisor = a.getDivisor() + b.getDivisor();

        FractionNumberClass result = new FractionNumberClass();
        if (commonDividend == 0 || commonDivisor == 0) {
            System.out.println("NullPointerException");
            System.out.println("Попробуйте установить другие числа");
            System.exit(0);
        } else {
            result.setDividend(commonDividend);
            result.setDivisor(commonDivisor);
        }
        return result;
    }

    public FractionNumberClass sub (FractionNumber a, FractionNumber b) {
        int commonDividend = a.getDividend() - b.getDividend();
        int commonDivisor = a.getDivisor() - b.getDivisor();

        FractionNumberClass result1 = new FractionNumberClass();
        if (commonDividend == 0 || commonDivisor == 0) {
            System.out.println("NullPointerException");
            System.out.println("Попробуйте установить другие числа");
            System.exit(0);
        } else {
            result1.setDividend(commonDividend);
            result1.setDivisor(commonDivisor);
        }
        return result1;
    }

    public FractionNumberClass mul (FractionNumber a, FractionNumber b) {
        int commonDividend = a.getDividend() * b.getDividend();
        int commonDivisor = a.getDivisor() * b.getDivisor();

        FractionNumberClass result2 = new FractionNumberClass();
        if (commonDividend == 0 || commonDivisor == 0) {
            System.out.println("NullPointerException");
            System.out.println("Попробуйте установить другие числа");
            System.exit(0);
        } else {
            result2.setDividend(commonDividend);
            result2.setDivisor(commonDivisor);
        }
        return result2;
    }

    FractionNumberClass div (FractionNumber a, FractionNumber b) {
        int commonDividend = a.getDividend() / b.getDividend();
        int commonDivisor = a.getDivisor() / b.getDivisor();

        FractionNumberClass result3 = new FractionNumberClass();

        if (commonDivisor == 0) {
            System.out.println("ArithmeticException");
            System.out.println("Произошло деление на 0, попробуйте установить другие числа");
            System.exit(0);
        } else {
            result3.setDivisor(commonDivisor);
        }

        if (commonDividend == 0) {
            System.out.println("NullPointerException");
            System.out.println("Попробуйте установить другие числа");
            System.exit(0);
        } else {
            result3.setDividend(commonDividend);
            result3.setDivisor(commonDivisor);
        }
        return result3;
    }
}
