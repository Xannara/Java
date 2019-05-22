package lesson10;

public class Person {
    private int age;
    private String name;
    private String phone;
    private int height;

// создание конструктора
    public Person(int height1, int age1) {
        height = height1;
        age = age1;
    }
// создание конструктора
    public Person(int age1, String name1) {
        age = age1;
        name = name1;
    }
// автоматическая генерация конструктора
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
