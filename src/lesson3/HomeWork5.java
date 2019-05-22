package lesson3;
// Нужно массив "перевернуть задом наперед". По итогу получится другой массив.
public class HomeWork5 {
    public static void main(String[] args) {
        char[] symbols = {'a', 'b', 'c', 'd', 'e'};
        char[] symbolsOther = new char[symbols.length];

        for (int i = symbols.length - 1; i >= 0; i--) {
            symbolsOther[i] = symbols[i];
            System.out.print(symbolsOther[i] + " ");
        }

    }
}
