package lesson6;
// вывод треугольника (пирамиды)
public class ClassWork4 {
    public static void main(String[] args) {
      /*  int [][] pyramide = new int[5][9];
        int count = 1;
        int indexCol = 4;
        for (int i = 0; i < pyramide.length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(pyramide[i][indexCol] + " ");
            }
            count = count + 2;
        }  */

        int rows = 9;
        String[] pyramid = new String[rows];
        pyramid[0] = "1";
        for (int row = 1; row < rows; row++) {
            pyramid[row] = (row + 1) + " " + pyramid[row - 1] + " " + (row + 1);
        }

        for (String line : pyramid) {
            int len = (pyramid[rows - 1].length() + line.length()) / 2;
            System.out.printf("%" + len + "s\n", line);
        }
    }
}
