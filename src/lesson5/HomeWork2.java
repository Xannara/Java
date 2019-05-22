package lesson5;
// поиск минимального числа
public class HomeWork2 {
    public static int searchMin (int list []) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            min = Math.min(min, list[i]);
        }
       return min;
    }

}
