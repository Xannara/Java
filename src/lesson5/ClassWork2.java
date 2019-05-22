package lesson5;
// свой метод, который виден в др. проектах
public class ClassWork2 {
    // 1 - модификатор доступа
    // 2 - статичность (частная или общая)
    // 3 - возвращаемый тип
    // 4 - название метода
    // 5 - входящие параметры (в скобках)
    public static void printHello () {
        System.out.println("Hello");
    }

    public static int squareArea (int side) {
        return side * side;
    }

    public static int perimetrTriangle (int sideTriangle1, int sideTriangle2, int sideTriangle3) {
        return sideTriangle1 + sideTriangle2 + sideTriangle3;
    }
}
