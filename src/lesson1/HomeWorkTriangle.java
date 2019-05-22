package lesson1;

public class HomeWorkTriangle {
    public static void main(String[] args) {
        double sideOne = 14;
        double sideTwo = 12;
        double sideThree = 12;

        double p = (sideOne + sideTwo + sideThree) / 2;
        double sTriangle = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));

        System.out.println(sTriangle);
    }
}
