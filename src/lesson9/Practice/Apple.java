package lesson9.Practice;

public class Apple extends Fruits {
    @Override
    public String toString() {
        return "Apple{" +
                "name='" + this.getName() + '\'' +      // this добавляется автоматически (но не виден)
                ", price=" + this.getPrice() +
                ", weight=" + this.getWeight() +
                ", priceOpt=" + this.getPriceOpt() +
                ", isFresh=" + this.isFresh() +
                '}';
    }
}