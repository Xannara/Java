package lesson2;

public class ClassWork3 {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int c = 7;

        if (a == b && b == c) {
            System.out.println("Равносторонний треугольник");
        } else if (a == b || b == c || c == a) {
            System.out.println("Равнобедренный треугольник ");
        } else if (a != b && b != c && c != a) {
            System.out.println("Разносторонний треугольник");
        }
    }
}
