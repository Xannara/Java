package lesson6;
// заполнить нижнюю диагональ 0
public class HomeWork3 {
    public static void main(String[] args) {
        int [][] numbers = {{1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1}};

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = numbers[i].length - 1; j >= i + 1; j--) {
                System.out.print(" " + 0 + " ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(" " + numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
