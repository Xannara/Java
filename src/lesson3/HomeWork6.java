package lesson3;
//  С использованием цикла for переписать все знаки препинания на пробелы
public class HomeWork6 {
    public static void main(String[] args) {
        String S = "У меня все хорошо, замечательно, у меня все - получается!";
        String Str = "";
        char [] strToChar = S.toCharArray();      // преобразование строки в массив символов

    for (int i = 0; i < strToChar.length; i++) {
        if (strToChar[i] == ',' || strToChar[i] == '!' || strToChar[i] == '-') {
            strToChar[i] = ' ';
            Str += strToChar[i];
        }
    }
        System.out.print("Новая строка: ");
        System.out.println(strToChar);
    }
}
