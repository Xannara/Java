package lesson6;
// timer
public class ClassWork1 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int day = 0; day < 366; day++) {
            for (int hour = 0; hour < 25; hour++) {
                for (int minute = 0; minute < 61; minute++)
                    for (int second = 0; second < 61; second++) {
                        System.out.printf("От старта прошло: %d дня, %d часа, %d секунд ", day, hour, minute, second);
                //        System.out.println();
                   //     Thread.sleep(1000);
                    }
            }
        }
        System.out.println("End");
    }
}
