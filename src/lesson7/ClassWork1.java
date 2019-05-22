package lesson7;

public class ClassWork1 {
    public static void main(String[] args) {
        int a = 9;
        Phone meizu = new Phone();
        Phone nokia = new Phone();

        nokia.setBattery(500);
        meizu.setBattery(1000);

        nokia.setColor("blue");
        meizu.setColor("red");

        nokia.setName("Nokia3310");
        meizu.setName("Meizu");

        nokia.setDiagonal(2.7);
        meizu.setDiagonal(3.1);

        meizu.printInfo();
        System.out.println();
        nokia.printInfo();

    }
}
