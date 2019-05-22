package lesson3;
// for & while
public class ClassWork6 {
    public static void main(String[] args) {
        for (int i = 10; i < 15; i++) {
            System.out.println(i);
        }

        int i = 10;
        while (i < 15) {
            System.out.println(i);
            i++;
        }

        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j < 15);
    }
}
