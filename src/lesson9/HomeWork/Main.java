package lesson9.HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// создание объектов и установка их свойств
        Triangle triangle1 = new Triangle();
        triangle1.setSide1(11);
        triangle1.setSide2(11);
        triangle1.setSide3(14);

        Triangle triangle2 = new Triangle();
        triangle2.setSide1(15);
        triangle2.setSide2(15);
        triangle2.setSide3(18);

        Triangle triangle3 = new Triangle();
        triangle3.setSide1(5);
        triangle3.setSide2(5);
        triangle3.setSide3(7);

        Rhombus rhombus1 = new Rhombus();
        rhombus1.setBasis(15);
        rhombus1.setHeight(14);

        Rhombus rhombus2 = new Rhombus();
        rhombus2.setBasis(21);
        rhombus2.setHeight(20);

        Rhombus rhombus3 = new Rhombus();
        rhombus3.setBasis(11);
        rhombus3.setHeight(10);

 // помещение объектов в массив
        Figure [] figures = new Figure[6];
        figures[0] = triangle1;
        figures[1] = triangle2;
        figures[2] = triangle3;
        figures[3] = rhombus1;
        figures[4] = rhombus2;
        figures[5] = rhombus3;

// создаем объект Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Вычислить площадь или периметр? ");
        String str = scan.nextLine();
        if (str.equals("периметр")) {
            for (int i = 0; i < figures.length; i++) {
                System.out.println("...");
                figures[i].printPerimetr();
            }
        }

        if (str.equals("площадь")) {
            for (int i = 0; i < figures.length; i++) {
                System.out.println("...");
                figures[i].printPloshad();
            }
        }
    }
}
