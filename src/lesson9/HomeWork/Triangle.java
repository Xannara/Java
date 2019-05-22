package lesson9.HomeWork;

public class Triangle extends Figure {
    private int side1;
    private int side2;
    private int side3;
    private int perimetr;
    private double area;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1='" + this.getSide1() + '\'' +
                ", side2='" + this.getSide2() + '\'' +
                ", side3='" + this.getSide3() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (side1 != triangle.side1) return false;
        if (side2 != triangle.side2) return false;
        return side3 == triangle.side3;
    }

    @Override
    public int hashCode() {
        int result = side1;
        result = 31 * result + side2;
        result = 31 * result + side3;
        return result;
    }

    @Override
    public void printPerimetr() {
        perimetr = side1 + side2 + side3;
        System.out.println("Периметр треугольника = " + perimetr);
    }

    @Override
    public void printPloshad() {
        int p = (side1 + side2 + side3) / 2;
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.println("Площадь треугольника = " + area);
    }
}
