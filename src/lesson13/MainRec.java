package lesson13;

import java.util.Scanner;

public class MainRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = getNumber(scanner);
        System.out.println(num);
    }

    private static int getNumber(Scanner scanner) {
        int number = 0;
        try {
            number = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.out.println("Введите другое значение");
            return getNumber(scanner);
        }
        return number;
    }
}
