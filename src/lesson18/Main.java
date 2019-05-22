package lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File dirFrom = new File("D:\\Oksana");
        File [] filesFromDir = dirFrom.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {       // отображает только папки в искомой папке
                    return true;
                }
                if (pathname.getAbsolutePath().endsWith(".png")|| pathname.getAbsolutePath().endsWith(".jpg") || pathname.getAbsolutePath().endsWith(".jpeg")) {
                    return true;                    // отображает картинки в искомой папке
                }
                return false;
            }
        });
        for (File file : filesFromDir) {
            System.out.println(file.getAbsolutePath()); // показывает пути ко всем файлам в искомой папке
        }
        /* if (!dirFrom.exists()) {                  // если папки нет, то создать ее
             dirFrom.mkdir();
         }
          System.out.println(dirFrom.exists());   */ // вывод boolean значения, существует ли папка
    }
}
