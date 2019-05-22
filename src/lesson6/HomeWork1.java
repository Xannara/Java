package lesson6;
// вывести 1 по диагонали
public class HomeWork1 {
    public static void main(String[] args) {
        int [][] numbers = {{1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1}};

  /*    System.out.print(numbers[0][0]);
        System.out.println();

        System.out.print("  " + numbers[1][1]);
        System.out.println();

        System.out.print("    " + numbers[2][2]);
        System.out.println();

        System.out.print("      " + numbers[3][3]);
        System.out.println();  */


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(numbers[i][j]);
                }
            }
            System.out.println();
        }
    }
}
