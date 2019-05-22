package lesson7;

public class HomeWorkRectangle {
    private int side1;
    private int side2;
    private String color;
    private int opacity;
    private int area;
    private int perimetr;

    public void setSide1 (int newSide1) {
        this.side1 = newSide1;
    }

    public void setSide2 (int newSide2) { this.side2 = newSide2; }

    public void setColor (String newColor) {
        this.color = newColor;
    }

    public void setOpacity (int newOpacity) {
        this.opacity = newOpacity;
    }

    public int getArea () {
        area = side1 * side2;
        return area;
    }

    public int getPerimetr () {
        perimetr = (side1 + side2) * 2;
        return perimetr;
    }

    public void printInfo() {
        System.out.printf("Сторона 1 - %d, Сторона 2 - %d, цвет - %s, прозрачность - %d, площадь - %d, периметр - %d",
                side1, side2, color, opacity, area, perimetr);
    }
}
