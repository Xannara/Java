package lesson9.HomeWork;

public class Rhombus extends Figure {
    private int height;
    private int basis;
    private int perimetr;
    private int area;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBasis() {
        return basis;
    }

    public void setBasis(int basis) {
        this.basis = basis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rhombus rhombus = (Rhombus) o;

        if (height != rhombus.height) return false;
        return basis == rhombus.basis;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + basis;
        return result;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "height='" + this.getHeight() + '\'' +
                ", basis='" + this.getBasis() + '\'' +
                '}';
    }

    @Override
    public void printPerimetr() {
        perimetr = 4 * basis;
        System.out.println("Периметр ромба = " + perimetr);
    }

    @Override
    public void printPloshad() {
        area = basis * height;
        System.out.println("Площадь ромба = " + area);
    }
}
