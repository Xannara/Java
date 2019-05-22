package lesson14;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        String inputNum = scanner.nextLine();
        int num = 0;

        try {
            num = Integer.parseInt(inputNum);
        }catch (NumberFormatException e) {            // в исключениях обязательно ставить выше того, кто ниже в иерархии
        System.out.println("!!!");
        }catch (Exception e) {                        // перехватывает все Exception исключения
            e.printStackTrace();
            System.out.println("Неверный формат");    // можно выводить вместо трейса свое сообщение
        } finally {
            System.out.println("ggg");
        }

        System.out.println(num);
    }
}
