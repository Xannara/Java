package lesson17.Karaoke;

public class Ved {
    public static void main(String[] args) {
        System.out.println("Начинаем концерт!");

        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer2.start();

        while (singer1.isAlive()) {   // для приостановки делается цикл с пустым телом (чтобы концерт оканчивался правильно)

        }

        System.out.println("Концерт окончен!");
    }
}
