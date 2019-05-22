package lesson6;
// вывод двухмерного массива четных чисел
public class ClassWork2 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        int startnum = 2;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = startnum;
                startnum = startnum + 2;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] < 10) {
                    System.out.print(numbers[i][j] + "  ");
                } else {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}