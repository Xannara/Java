package lesson5;
// метод должен вернуть массив с гласными буквами из текста.
public class HomeWork6 {
    public static void glasChar (String str) {
        char [] symbols = str.toCharArray();
        for (char ch : symbols) {
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'y' || ch == 'i') {
                System.out.print(ch + " ");
               // System.out.print(symbols[ch] + " ");
            }

        }
    }
}
