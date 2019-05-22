package lesson6;
// вывод половины двухмерного массива (треугольник)
public class ClassWork3 {
    public static void main(String[] args) {
        int [][] numbers = {{1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1}};
// длинный путь
        System.out.print(numbers[0][0] + " ");
        System.out.println();

        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.println();

        System.out.print(numbers[2][0] + " ");
        System.out.print(numbers[2][1] + " ");
        System.out.print(numbers[2][2] + " ");
        System.out.println();

        System.out.print(numbers[3][0] + " ");
        System.out.print(numbers[3][1] + " ");
        System.out.print(numbers[3][2] + " ");
        System.out.print(numbers[3][3] + " ");
        System.out.println();
// короткий путь
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
    }
}
