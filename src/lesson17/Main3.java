package lesson17;

public class Main3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Третий поток начал работу");
        for (int i = 500; i < 510; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Третий поток закончил работу");
    }
}
