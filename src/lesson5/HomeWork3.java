package lesson5;
// поиск максимального числа
public class HomeWork3 {
    public static int searchMax (int list []) {
        int max = list[0];
        for (int i =0; i < list.length; i++) {
            max = Math.max(max, list[i]);
        }
        return max;
    }
}
