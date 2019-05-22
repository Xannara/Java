package lesson3;
// Есть массив букв {a,b,c,d} и {q,w,e,r}. Соединить 2 эти массива в один с помощью цикла.
public class HomeWork4 {
    public static void main(String[] args) {
        char [] symbolsOne = {'a', 'b', 'c', 'd'};
        char [] symbolsTwo = {'q', 'w', 'e', 'r'};
        char [] symbolsThree = new char[symbolsOne.length + symbolsTwo.length];
// копирование 1-го и 2-го массивов в 3-ий
        System.arraycopy(symbolsOne, 0, symbolsThree, 0, symbolsOne.length);
        System.arraycopy(symbolsTwo, 0, symbolsThree, symbolsOne.length, symbolsTwo.length);

        for (int i = 0; i < symbolsThree.length; i++) {
            System.out.println(i + ": " + symbolsThree[i]);
        }

    }
}
