package lesson7;

public class Phone {
    private double diagonal;     // автоматически инициализируется, как 0
    private String color;
    private int battery;
    private String name;

    public void setBattery(int newBattery) {
        this.battery = newBattery;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setDiagonal(double newDiagonal) {
        this.diagonal = newDiagonal;
    }

    public void printInfo() {
        System.out.printf("Телефон: диагональ - %f, батарея - %d, цвет - %s, имя - %s", diagonal, battery, color, name);
    }

}
