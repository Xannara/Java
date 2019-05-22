package lesson3;
// Есть массив букв {a,b,c,d} и {q,w,e,r}. Соединить 2 эти массива в один с помощью цикла.
public class HomeWork4_other {
    public static void main(String[] args) {
        char [] a = {'a', 'b', 'c', 'd'};
        char [] b = {'q', 'w', 'e', 'r'};

        char [] c = new char[a.length + b.length];

        for (int i =0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            }
            else {
                c[i] = b[i - a.length];      // вычитаем i - длина первого массива
            }
        }
        System.out.println(c);
    }
}
