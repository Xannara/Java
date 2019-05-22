package lesson10.HomeWork;

public class Main {
    public static void main(String[] args) {
        FractionNumberClass number1 = new FractionNumberClass();
        FractionNumberClass number2 = new FractionNumberClass();

        number1.setDividend(5);
        number1.setDivisor(8);

        number2.setDividend(3);
        number2.setDivisor(4);

        System.out.println("Вещественное представление первого числа: " + number1.value());
        System.out.println("Строковое представление первого числа: ");
        number1.toString();

        System.out.println();
        System.out.println(" --------------- ");
        System.out.println();

        System.out.println("Вещественное представление второго числа: " + number2.value());
        System.out.println("Строковое представление второго числа: ");
        number2.toString();

        System.out.println();
        System.out.println(" --------------- ");
        System.out.println();

        FractionNumberOperationClass add = new FractionNumberOperationClass();
        FractionNumberClass result = add.add(number1, number2);
        System.out.println("Сумма дробных чисел: ");
        result.printInfo();

        System.out.println();
        System.out.println(" --------------- ");
        System.out.println();

        FractionNumberOperationClass sub = new FractionNumberOperationClass();
        FractionNumberClass result1 = sub.sub(number1, number2);
        System.out.println("Разность дробных чисел: ");
        result1.printInfo();

        System.out.println();
        System.out.println(" --------------- ");
        System.out.println();

        FractionNumberOperationClass mul = new FractionNumberOperationClass();
        FractionNumberClass result2 = mul.mul(number1, number2);
        System.out.println("Произведение дробных чисел: ");
        result2.printInfo();

        System.out.println();
        System.out.println(" --------------- ");
        System.out.println();

        FractionNumberOperationClass div = new FractionNumberOperationClass();
        FractionNumberClass result3 = div.div(number1, number2);
        System.out.println("Частное дробных чисел: ");
        result3.printInfo();

    }
}

