package lesson17.Karaoke;

public class Singer2 extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.microphone){
                try {
                    Monitors.microphone.wait();      // генерируется красной лампочкой
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 4; i++) {
                System.out.println("LEI-----");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.microphone) {
                Monitors.microphone.notify();
            }
        }
    }
}
