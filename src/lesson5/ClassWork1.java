package lesson5;
// длина строки
public class ClassWork1 {
    public static void main(String[] args) {
        String text = "qwerty";
        System.out.println(text.length());

        ClassWork2.printHello();// вызов написанного в ClassWork2 метода

        int result = ClassWork2.squareArea(4);   // вызов метода подсчета площади квадрата
        System.out.println(result);

        String text2 = StringUtils.reverseString("qwerty");   // вызов метода переворачивания строки
        System.out.println(text2);

        int perimetr = ClassWork2.perimetrTriangle(4, 5, 6);  // вызов метода подсчета периметра треугольника
        System.out.println(perimetr);

        StringUtils.glasSymbol("London");     // вызов метода гласных букв



    }
}
