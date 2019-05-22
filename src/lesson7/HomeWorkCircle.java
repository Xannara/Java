package lesson7;

public class HomeWorkCircle {
    private int radius;
    private String color;
    private int opacity;
    private double area;
    private double perimetr;

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setOpacity(int newOpacity) {
        this.opacity = newOpacity;
    }

    public double getArea() {
        area = 3.14 * (radius * radius);
        return area;
    }

    public double getPerimetr() {
        perimetr = 2 * 3.14 * radius;
        return perimetr;
    }

    public void printInfo() {
        System.out.printf("Радиус- %d, цвет - %s, прозрачность - %d, площадь - %f, периметр - %f",
                radius, color, opacity, area, perimetr);
    }
}

