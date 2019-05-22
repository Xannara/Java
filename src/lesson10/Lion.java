package lesson10;

public class Lion implements Animal {   // можно указывать несколько интерфейсов и одного наследника
    @Override
    public void breaf() {
        System.out.println("Дыхание");
    }

    @Override
    public void voice() {
        System.out.println("ppp");
    }
}
