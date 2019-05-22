package lesson6;
// вывод половины пирамиды сверху
public class HomeWork2 {
    public static void main(String[] args) {
        int [][] numbers = {{1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1}};

     /* System.out.print(numbers[3][3] + " ");
        System.out.print(numbers[3][2] + " ");
        System.out.print(numbers[3][1] + " ");
        System.out.print(numbers[3][0] + " ");
        System.out.println();

        System.out.print("  " + numbers[2][2] + " ");
        System.out.print(numbers[2][1] + " ");
        System.out.print(numbers[2][0] + " ");
        System.out.println();

        System.out.print("    " + numbers[1][1] + " ");
        System.out.print(numbers[1][0] + " ");
        System.out.println();

        System.out.print("      " + numbers[0][0] + " ");
        System.out.println(); */


        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = numbers[i].length; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
