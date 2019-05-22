package lesson9;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.setName("Лёва");

        Lion lion2 = new Lion();
        lion2.setName("Лёва");

        System.out.println(lion1.equals(lion2));
        System.out.println(lion1);

// вывод голоса льва
        lion1.voice();
        Animal animal = new Animal();
        animal.voice();



    }
}
