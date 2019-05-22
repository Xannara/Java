package lesson5;
// метод должен напечатать на консоль одну букву из текста, которая стоит максимально близко к началу алфавита.
public class HomeWork7 {
    public static void Symbol(String str) {
        char[] strToChar = str.toCharArray();
        int min = strToChar[0];
        char symbol = ' ';
        for (int i = 0; i < 25; i++) {
            if (strToChar[i] == 'a') {
                strToChar[i] = 0;
            }
            if (strToChar[i] == 'b') {
                strToChar[i] = 1;
            }
            if (strToChar[i] == 'c') {
                strToChar[i] = 2;
            }
            if (strToChar[i] == 'd') {
                strToChar[i] = 3;
            }
            if (strToChar[i] == 'e') {
                strToChar[i] = 4;
            }
            if (strToChar[i] == 'f') {
                strToChar[i] = 5;
            }
            if (strToChar[i] == 'g') {
                strToChar[i] = 6;
            }
            if (strToChar[i] == 'h') {
                strToChar[i] = 7;
            }
            if (strToChar[i] == 'i') {
                strToChar[i] = 8;
            }
            if (strToChar[i] == 'j') {
                strToChar[i] = 9;
            }
            if (strToChar[i] == 'k') {
                strToChar[i] = 10;
            }
            if (strToChar[i] == 'l') {
                strToChar[i] = 11;
            }
            if (strToChar[i] == 'm') {
                strToChar[i] = 12;
            }
            if (strToChar[i] == 'n') {
                strToChar[i] = 13;
            }
            if (strToChar[i] == 'o') {
                strToChar[i] = 14;
            }
            if (strToChar[i] == 'p') {
                strToChar[i] = 15;
            }
            if (strToChar[i] == 'q') {
                strToChar[i] = 16;
            }
            if (strToChar[i] == 'r') {
                strToChar[i] = 17;
            }
            if (strToChar[i] == 's') {
                strToChar[i] = 18;
            }
            if (strToChar[i] == 't') {
                strToChar[i] = 19;
            }
            if (strToChar[i] == 'u') {
                strToChar[i] = 20;
            }
            if (strToChar[i] == 'v') {
                strToChar[i] = 21;
            }
            if (strToChar[i] == 'w') {
                strToChar[i] = 22;
            }
            if (strToChar[i] == 'x') {
                strToChar[i] = 23;
            }
            if (strToChar[i] == 'y') {
                strToChar[i] = 24;
            }
            if (strToChar[i] == 'z') {
                strToChar[i] = 25;
            }

            for (int j = 0; j < strToChar.length; j++) {
                //    min = str.indexOf("a");
                //    System.out.println(min);
                if (str.charAt(j) == 'a') {
                    System.out.println("Буква a на " + (j + 1) + " месте");
                    break;

                    //  for (int j = 0; j < strToChar.length; j++) {
                    //   System.out.println(strToChar[i]);
                    //  min = Math.min(min, strToChar[j]);
                    // symbol = strToChar[j];
                    //   System.out.print(i+" = " + strToChar[i]+" ");
                }
                // System.out.print(symbol);

            }
            // symbol = strToChar[min];
            //  System.out.println(strToChar[min]);
        }
    }
}




