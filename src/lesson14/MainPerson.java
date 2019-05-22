package lesson14;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        try {
            person.setAge(340);
        } catch (RuntimeException e) {
            System.out.println("Что-то не так с возрастом");
        }

        System.out.println(person);
    }
}
