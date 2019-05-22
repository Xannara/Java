package lesson5;

public class HomeWork7_other {
    public static void main(String[] args) {

    }
    public static void FirstSymbol(String str) {
        String textToLower = str.toLowerCase();
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        int [] indexes = new int[textToLower.length()];
        for (int i = 0;i < textToLower.length(); i++) {
            char current = textToLower.charAt(i);
            int index = alfabet.indexOf(current);
            indexes[i] = index;
        }
        int min = indexes[0];
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] < min && indexes[i] != -1) {         // если индекс меньше мин, то мин стоановится им
                min = indexes[i];                               // и проверка, что не является знаком препинания
            }
        }
        System.out.println(alfabet.charAt(min));
    }

}
