package lesson2;
// задача про сок
public class HomeWork6 {
    public static void main(String[] args) {
       int appleTree = 5;    // яблони
       int pearTree = 3;     // груши

       int appleBucket = 6;  // собрано ведер с каждой яблони
       int pearBucket = 10;  // собрано ведер с каждой груши

        int appleJuice = 4;  // сделано сока с одного ведра яблок
        int pearJuice = 3;   // сделано сока с одного ведра груш

        int totalDay = 0;         // сколько сока хватит на Х дней

        int totalBucketFromAppleTree = appleTree * appleBucket;       // всего ведер с яблони
        int totalBucketFromPearTree = pearTree * pearBucket;          // всего ведер с груши

        int totalJuiceFromAppleBucket = totalBucketFromAppleTree * appleJuice;    // всего сока с яблони
        int totalJuiceFromPearBucket = totalBucketFromPearTree * pearJuice;       // всего сока с груши

        int totalJuice = totalJuiceFromAppleBucket + totalJuiceFromPearBucket;    // всего сока с яблонь и груш

        for (int day = 0; day <= (totalJuice * 2); day++) {
             totalDay = day;
        }
        System.out.println("Сока хватит на " + totalDay + " дней");
    }

}
