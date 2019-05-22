package lesson3;
/* Есть массив букв {a,b,c,d} и {q,w,e,r}.
   Так же у есть предложение "Are you ready to start studying of programming?"
   Нужно переписать каждый символ "а" на символ "q", символ "b" на "w" и т.д... (на символ стоящий во втором
   массиве на такой же позиции как и в первом массиве) */
public class HomeWork7 {
    public static void main(String[] args) {
        char [] symbolsOne = {'a', 'b', 'c', 'd'};
        char [] symbolsTwo = {'q', 'w', 'e', 'r'};
        String Str = "Are you ready to start studying of programming?";

        char [] strToChar = Str.toCharArray();        // преобразование строки в массив символов

        for (int i = 0; i < symbolsOne.length; i++) {
            if (symbolsOne[i] == 'a') {
                symbolsOne[i] = symbolsTwo[0];
            }
            if (symbolsOne[i] == 'b') {
                symbolsOne[i] = symbolsTwo[1];
            }
            if (symbolsOne[i] == 'c') {
                symbolsOne[i] = symbolsTwo[2];
            }
            if (symbolsOne[i] == 'd') {
                symbolsOne[i] = symbolsTwo[3];
            }
        }

        for (int j = 0; j < strToChar.length; j++) {
            if (strToChar[j] == 'A' || strToChar[j] == 'a') {
                strToChar[j] = symbolsOne[0];
            }
            if (strToChar[j] == 'B' || strToChar[j] == 'b') {
                strToChar[j] = symbolsOne[1];
            }
            if (strToChar[j] == 'C' || strToChar[j] == 'c') {
                strToChar[j] = symbolsOne[2];
            }
            if (strToChar[j] == 'D' || strToChar[j] == 'd') {
                strToChar[j] = symbolsOne[3];
            }
        }
        System.out.print("Новая строка: ");
        System.out.println(strToChar);
    }
}
