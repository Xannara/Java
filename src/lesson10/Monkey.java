package lesson10;

public class Monkey implements Animal {
    @Override
    public void breaf() {
        System.out.println("дыхание");
    }

    @Override
    public void voice() {
        System.out.println("ya");
    }
}
