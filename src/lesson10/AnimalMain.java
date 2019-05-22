package lesson10;

public class AnimalMain {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();

        Animal[] animals = new Animal[2];
        animals[0] = lion;
        animals[1] = monkey;

        for (Animal a: animals) {
            a.voice();
        }
    }
}
