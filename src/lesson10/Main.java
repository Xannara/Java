package lesson10;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(23, "Ivan");  // если 2 конструктора, то по переменным можно выбрать какой вызывать
     //   person.setAge(23);
     //   person.setName("Ivan");
        System.out.println(person);

    }
}
