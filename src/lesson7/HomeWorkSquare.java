package lesson7;

public class HomeWorkSquare {
    private int side;
    private String color;
    private int opacity;
    private int area;
    private int perimetr;

    public void setSide (int newSide) {
        this.side = newSide;
    }

    public void setColor (String newColor) {
        this.color = newColor;
    }

    public void setOpacity (int newOpacity) {
        this.opacity = newOpacity;
    }

    public int getArea () {
        area = side * side;
        return area;
    }

    public int getPerimetr () {
        perimetr = 4 * side;
        return perimetr;
    }

    public void printInfo () {
        System.out.printf("Сторона- %d, цвет - %s, прозрачность - %d, площадь - %d, периметр - %d",
    side, color, opacity, area, perimetr);
}

}
