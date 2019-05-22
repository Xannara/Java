package lesson9;

public class Animal {
    private int age;
    private String name;
    private String typeOfFoods;
    private int price;

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

    public String getTypeOfFoods() {
        return typeOfFoods;
    }

    public void setTypeOfFoods(String typeOfFoods) {
        this.typeOfFoods = typeOfFoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
// переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (price != animal.price) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return typeOfFoods != null ? typeOfFoods.equals(animal.typeOfFoods) : animal.typeOfFoods == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typeOfFoods != null ? typeOfFoods.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
// переопределение метода toString
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", typeOfFoods='" + typeOfFoods + '\'' +
                ", price=" + price +
                '}';
    }
// определение метода Голос (основной)
    public void voice () {
        System.out.println("гав-гав");
    }
}
