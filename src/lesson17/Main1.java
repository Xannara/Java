package lesson17;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Первый поток начал работу");
        Main2 main2 = new Main2();                     // создаем объект второго потока и вызываем его
        main2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Первый поток закончил работу");
    }
}
