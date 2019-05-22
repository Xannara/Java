package lesson17.Karaoke;

public class Singer1 extends Thread{
    private boolean isRun = true;

    @Override
    public void run() {
        int count = 0;
        while (isRun) {
            for (int i = 0; i < 3; i++) {
                System.out.println("-----LA");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.microphone) {
                Monitors.microphone.notify();
            }

            synchronized (Monitors.microphone){
                try {
                    Monitors.microphone.wait();      // генерируется красной лампочкой
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count > 3) {
                isRun = false;
            }
        }
    }
}
