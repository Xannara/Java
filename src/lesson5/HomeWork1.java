package lesson5;
// вызов всех методов
public class HomeWork1 {
    public static void main(String[] args) {
// вызов метода поиска минимального числа searchMin
        int min = HomeWork2.searchMin(new int[]{9, 3, 2});      // передача массива в метод
        System.out.println("Минимальное число: " + min);
        System.out.println(" ");                                // вывод пустого разделителя строк

// вызов метода поиска минимального числа searchMin
        int max = HomeWork3.searchMax(new int[]{5, 8, 3});
        System.out.println("Минимальное число: " + max);
        System.out.println(" ");

// вызов метода подсчета длины строки
        System.out.println("Длина строки: " + HomeWork4.lengthString("qwerty123"));
        System.out.println(" ");

// вызов метода вывода на консоль по одному слову в каждой строчке
        HomeWork5.consoleSting("London is a capital of the great britain");
        System.out.println(" ");

// вызов метода вывода массива с гласными буквами
        HomeWork6.glasChar("London is a capital of the great britain");
        System.out.println(" ");

// вызов метода вывода на консоль одной буквы из текста, которая стоит максимально близко к началу алфавита
        HomeWork7_other.FirstSymbol("London is a capital of the great britain");
    }
}



