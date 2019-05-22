package lesson4;

public class ClassWork2 {
    public static void main(String[] args) {
        String email = "  natalia.shulga@gmail.com ";
        String emailInDB = "natalia.shulga@gmail.com";

        String result = email.trim();             // убирает пробелы с начала и с конца
        if (result.equals(emailInDB)) {
            System.out.println("Вход в систему выполнен");
        } else {
            System.out.println("Введен неверный email");
        }
    }
}
