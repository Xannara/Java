package lesson1;

public class Tables {
    public static void main(String[] args) {
        double lengthRoom = 13;
        double widthRoom = 7;
        double lengthTable = 1.5;
        double widthTable = 2;

        double sRoom = lengthRoom * widthRoom;
        double sTable = lengthTable * widthTable;

        int result = (int)(sRoom / sTable);  // преобразование типов данных

        System.out.println("Количество столов = " + result);
    }
}
