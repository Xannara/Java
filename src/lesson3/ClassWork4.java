package lesson3;
// вывести только гласные буквы
public class ClassWork4 {
    public static void main(String[] args) {
        char [] symbols = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 'a' ||  symbols[i] == 'e') {
                System.out.println(symbols[i]);
            }
        }
    }
}
