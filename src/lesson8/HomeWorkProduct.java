package lesson8;

public class HomeWorkProduct {
    private int productId;
    private int price;
    private String nameProduct;
    private int quantityAvailable;
    private String deliverToHome;

    private HomeWorkCharacteristic [] characteristics = new HomeWorkCharacteristic[20];
    private HomeWorkComment [] comments = new HomeWorkComment[100];

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getDeliverToHome() {
        return deliverToHome;
    }

    public void setDeliverToHome(String deliverToHome) {
        this.deliverToHome = deliverToHome;
    }

    public HomeWorkCharacteristic[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(HomeWorkCharacteristic[] characteristics) {
        this.characteristics = characteristics;
    }

    public HomeWorkComment[] getComments() {
        return comments;
    }

    public void setComments(HomeWorkComment[] comments) {
        this.comments = comments;
    }

    public void addCharacteristic (HomeWorkCharacteristic characteristic) {
        for (int i = 0; i < characteristics.length; i++) {
            if (characteristics[i] == null) {
                characteristics[i] = characteristic;
                return;
            }
        }
    }

    public void addComment (HomeWorkComment comment) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i] == null) {
                comments[i] = comment;
                return;
            }
        }
    }

    public void printInfo () {
        System.out.printf("Товар: код - %d, имя - %s, цена - %d, в наличии - %d, доставка на дом - %s",
                productId, nameProduct, price, quantityAvailable, deliverToHome);
        System.out.println();
        for (HomeWorkCharacteristic h : characteristics) {
            if (h != null) {
                System.out.println(h.getKey() + ": " + h.getValue());
            }
        }
        System.out.println();
        for (HomeWorkComment c: comments) {
            if (c != null) {
                System.out.println("Отзыв от: " + c.getNameClient());
                System.out.println("Дата комментария: " + c.getDateComment());
                System.out.println("Рейтинг: " + c.getRating());
                System.out.println("Комментарий: " + c.getComment());
                System.out.println("Лайк: " + c.getLike());
                System.out.println("Дизлайк: " + c.getDislike());
                System.out.println("Достоинства: " + c.getPlus());
                System.out.println("Недостатки: " + c.getMinus());
            }
        }
    }
}
