package lesson19.ClassWork;

import lesson19.FileCopyWithChannel;
import lesson19.FileCopyWithJava7;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("D:\\Oksana\\Видео\\звук8.wav", "D:\\Oksana-1\\sound8.wav");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("D:\\Oksana\\Видео\\звук7.wav", "D:\\Oksana-1\\sound7.wav");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("D:\\Oksana\\Видео\\звук6.wav", "D:\\Oksana-1\\sound6.wav");
        CopyFileTaskImpl task4 = new CopyFileTaskImpl("D:\\Oksana\\Видео\\звук5.wav", "D:\\Oksana-1\\sound5.wav");
        CopyFileTaskImpl task5 = new CopyFileTaskImpl("D:\\Oksana\\Видео\\звук4.wav", "D:\\Oksana-1\\sound4.wav");

        task1.setFileCopyUtils(new FileCopyWithJava7());
        task2.setFileCopyUtils(new FileCopyWithJava7());
        task3.setFileCopyUtils(new FileCopyWithJava7());
        task4.setFileCopyUtils(new FileCopyWithJava7());
        task5.setFileCopyUtils(new FileCopyWithJava7());

        FindFilesTaskImpl task6 = new FindFilesTaskImpl();
        task6.setDirectory("D:\\Oksana-1");
        task6.setFileNameSearchString("map");
        task6.setPrintStream(System.out);

        FindFilesTaskImpl task7 = new FindFilesTaskImpl();
        task7.setDirectory("D:\\Oksana-1");
        task7.setFileNameSearchString("map_1");
        task7.setPrintStream(System.out);

        FindFilesTaskImpl task8 = new FindFilesTaskImpl();
        task8.setDirectory("D:\\Oksana-1");
        task8.setFileNameSearchString("map_2");
        task8.setPrintStream(System.out);

        FindFilesTaskImpl task9 = new FindFilesTaskImpl();
        task9.setDirectory("D:\\Oksana-1");
        task9.setFileNameSearchString("map_3");
        task9.setPrintStream(System.out);

        FindFilesTaskImpl task10 = new FindFilesTaskImpl();
        task10.setDirectory("D:\\Oksana-1");
        task10.setFileNameSearchString("map_4");
        task10.setPrintStream(System.out);

        TasksStorageImpl storage = new TasksStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);
        storage.add(task7);
        storage.add(task8);
        storage.add(task9);
        storage.add(task10);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        executor1.setStorage(storage);

        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        executor2.setStorage(storage);

        TaskExecutorImpl executor3 = new TaskExecutorImpl();
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();

    }
}
