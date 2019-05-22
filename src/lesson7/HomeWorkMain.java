package lesson7;

public class HomeWorkMain {
    public static void main(String[] args) {
        HomeWorkSquare square1 = new HomeWorkSquare();
        HomeWorkSquare square2 = new HomeWorkSquare();

        square1.setSide(25);
        square2.setSide(15);

        square1.setColor("red");
        square2.setColor("blue");

        square1.setOpacity(100);
        square2.setOpacity(50);

        square1.getArea();
        square2.getArea();

        square1.getPerimetr();
        square2.getPerimetr();

        System.out.println("Квадрат: ");
        square1.printInfo();
        System.out.println();
        square2.printInfo();
        System.out.println();
        System.out.println();

        HomeWorkRectangle rectangle1 = new HomeWorkRectangle();
        HomeWorkRectangle rectangle2 = new HomeWorkRectangle();

        rectangle1.setSide1(9);
        rectangle1.setSide2(12);
        rectangle2.setSide1(5);
        rectangle2.setSide2(4);

        rectangle1.setColor("white");
        rectangle2.setColor("black");

        rectangle1.setOpacity(80);
        rectangle2.setOpacity(20);

        rectangle1.getArea();
        rectangle2.getArea();

        rectangle1.getPerimetr();
        rectangle2.getPerimetr();

        System.out.println("Прямоугольник: ");
        rectangle1.printInfo();
        System.out.println();
        rectangle2.printInfo();
        System.out.println();
        System.out.println();

        HomeWorkTriangle triangle1 = new HomeWorkTriangle();
        HomeWorkTriangle triangle2 = new HomeWorkTriangle();

        triangle1.setSide1(12);
        triangle1.setSide2(14);
        triangle1.setSide3(12);
        triangle2.setSide1(10);
        triangle2.setSide2(13);
        triangle2.setSide3(10);

        triangle1.setColor("yellow");
        triangle2.setColor("orange");

        triangle1.setOpacity(40);
        triangle2.setOpacity(60);

        triangle1.getArea();
        triangle2.getArea();

        triangle1.getPerimetr();
        triangle2.getPerimetr();

        System.out.println("Треугольник: ");
        triangle1.printInfo();
        System.out.println();
        triangle2.printInfo();
        System.out.println();
        System.out.println();

        HomeWorkCircle circle1 = new HomeWorkCircle();
        HomeWorkCircle circle2 = new HomeWorkCircle();

        circle1.setRadius(7);
        circle2.setRadius(13);

        circle1.setColor("pink");
        circle2.setColor("magenta");

        circle1.setOpacity(30);
        circle2.setOpacity(70);

        circle1.getArea();
        circle2.getArea();

        circle1.getPerimetr();
        circle2.getPerimetr();

        System.out.println("Круг: ");
        circle1.printInfo();
        System.out.println();
        circle2.printInfo();
        System.out.println();
        System.out.println();
    }
}
