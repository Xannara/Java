package lesson15;

import lesson14.CustomException;
import lesson14.StringUtilsImpl;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);  // последний пример из ДЗ с логированием
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        try {
           double [] result = utils.findNumbers("12.3 fgjfkgjvkf");
           for (double d: result) {
               System.out.println(d);
           }
        } catch (CustomException e) {
            e.printStackTrace();
        }
        logger.info("Message");

    }
}
