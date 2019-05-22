package lesson17;

public class Main2 extends Thread {
    @Override
    public void run() {
        System.out.println("Второй поток начал работу");
        for (int i = 100; i < 120; i++) {
            System.out.println(i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 110) {
                Main3 main3 = new Main3();
                Thread thread2 = new Thread(main3);
                thread2.start();
            }
        }
        System.out.println("Второй поток закончил работу");
    }
}

