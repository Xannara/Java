package lesson19;

public class Main {
    public static void main(String[] args) {
        FileCopyWithChannel copyUtils1 = new FileCopyWithChannel();
        FileCopyWithJava7 copyUtils2 = new FileCopyWithJava7();

        try {
            copyUtils1.copyFile("D:\\Oksana\\map.png", "D:\\Oksana-1\\map_2.png");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        try {
            copyUtils2.copyFile("D:\\Oksana\\map.png", "D:\\Oksana-1\\map_3.png");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
