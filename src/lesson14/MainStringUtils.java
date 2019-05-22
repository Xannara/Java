package lesson14;

public class MainStringUtils {
    public static void main(String[] args) {
        StringUtilsImpl stringUtils = new StringUtilsImpl();
        double result = stringUtils.div("12", "6");
        System.out.println("Результат деления: " + result);
        System.out.println("---------");


        StringUtilsImpl utils = new StringUtilsImpl();
        try {
            double[] result1 = utils.findNumbers("123.5 fgjfkgjvkf 45.89");
            System.out.println("Числа типа double: ");
            for (double d: result1) {
                System.out.println(d);
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }

        System.out.println("---------");

        StringUtilsImpl util = new StringUtilsImpl();
        try {
            int[] result2 = util.findWord("А роза упала на лапу Азора", "роза");
            for (int i: result2) {
                System.out.println("Позиция в массиве: " + i);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
