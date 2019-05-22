package lesson4;

public class ClassWork1 {
    public static void main(String[] args) {
        String text1 = "text to print";
        String text2 = "new text to print";

        String text3 = text2.replace('w', 'W');
        System.out.println(text3);

        String text4 = text1.toUpperCase();    // первод строки в верхний регистр
        System.out.println(text4);

        char ch = text2.charAt(0);    // извлечение символа из текста
        System.out.println(ch);

        String text5 = text1.concat(text2);
        String text6 = text1 + " " + text2;
        System.out.println(text5);
        System.out.println(text6);
    }
}
