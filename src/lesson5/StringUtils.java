package lesson5;

public class StringUtils {
    public static String reverseString (String str) {

        return new StringBuffer(str).reverse().toString();
    }
    public static void glasSymbol (String st) {   // возвращает строку
        char [] symbols = st.toCharArray();
        for (char ch : symbols) {
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'y') {
                System.out.print(ch);
            }
        }
    }
}
