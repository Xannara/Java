package lesson3;
/* Есть массив букв {a,b,c,d} и {q,w,e,r}.
   Так же у есть предложение "Are you ready to start studying of programming?"
   Нужно переписать каждый символ "а" на символ "q", символ "b" на "w" и т.д... (на символ стоящий во втором
   массиве на такой же позиции как и в первом массиве) */
public class HomeWork7_other {
    public static void main(String[] args) {
        char [] symbolsOne = {'a', 'b', 'c', 'd'};
        char [] symbolsTwo = {'q', 'w', 'e', 'r'};
        String Str = "Are you ready to start studying of programming?";
        String result = Str.toLowerCase();

        for (int i = 0; i < symbolsOne.length; i++) {
            result = result.replace(symbolsOne[i], symbolsTwo[i]);

        }

        System.out.println(result);
    }
}
