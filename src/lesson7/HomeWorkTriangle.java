package lesson7;

public class HomeWorkTriangle {
    private int side1;
    private int side2;
    private int side3;
    private String color;
    private int opacity;
    private double area;
    private int perimetr;

    public void setSide1 (int newSide1) {
        this.side1 = newSide1;
    }

    public void setSide2 (int newSide2) {
        this.side2 = newSide2;
    }

    public void setSide3 (int newSide3) {
        this.side3 = newSide3;
    }

    public void setColor (String newColor) {
        this.color = newColor;
    }

    public void setOpacity (int newOpacity) {
        this.opacity = newOpacity;
    }

    public double getArea () {
        int p = (side1 + side2 + side3) / 2;
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    public int getPerimetr () {
        perimetr = side1 + side2 + side3;
        return perimetr;
    }

    public void printInfo () {
        System.out.printf("Сторона 1 - %d, Сторона 2 - %d, Сторона 3 - %d, цвет - %s, прозрачность - %d, площадь - %f, периметр - %d",
                side1, side2, side3, color, opacity, area, perimetr);
    }
}

