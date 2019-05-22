package lesson1;

public class HomeWorkVolume {
    public static void main(String[] args) {
        double lengthBox = 40;
        double widthBox = 30;
        double heightBox = 15;

        double lengthCube = 5;
        double widthCube = 5;
        double heightCube = 5;

        double vBox = lengthBox * widthBox * heightBox;
        double vCube = lengthCube * widthCube * heightCube;

        int result = (int) (vBox / vCube);

        System.out.println("Количество кубиков = " + result);
        }
    }

