package lesson9.HomeWork;

public class Figure {
    private String name;
    private String texture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void printPerimetr () {
        int side1 = 0;
        int side2 = 0;
        int perimetr;
        perimetr = (side1 + side2) * 2;
        System.out.printf("Сторона 1 - %d, Сторона 2 - %d, периметр - %d",
                side1, side2, perimetr);
    }

    public void printPloshad () {
        int side1 = 0;
        int side2 = 0;
        int area;
        area = side1 * side2;
        System.out.printf("Сторона 1 - %d, Сторона 2 - %d, цвет - %s, прозрачность - %d, площадь - %d, периметр - %d",
                side1, side2, area);
    }


}
