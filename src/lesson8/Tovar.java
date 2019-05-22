package lesson8;

public class Tovar {
    private int id_tovar;
    private int fixPrice;
    private int discount;
    private String nameTovar;
    private String type;
    private String nameColor;
    private String colorId;
    private boolean avaliable;
    private Caracteristic [] caracteristics = new Caracteristic[20];
    private Otzyv [] otzyvs = new Otzyv[1000];

    public int getId_tovar() {
        return id_tovar;
    }

    public void setId_tovar(int id_tovar) {
        this.id_tovar = id_tovar;
    }

    public int getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(int fixPrice) {
        this.fixPrice = fixPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public Caracteristic[] getCaracteristics() {
        return caracteristics;
    }

    public void setCaracteristics(Caracteristic[] caracteristics) {
        this.caracteristics = caracteristics;
    }

    public Otzyv[] getOtzyvs() {
        return otzyvs;
    }

    public void setOtzyvs(Otzyv[] otzyvs) {
        this.otzyvs = otzyvs;
    }

    public void addCaracteristic(Caracteristic caracteristic) {
        for (int i = 0; i < caracteristics.length; i++) {
            if (caracteristics[i] == null) {
                caracteristics[i] = caracteristic;
                return;
            }

        }
    }

    public void addOtzyv(Otzyv otzyv) {
        for (int i = 0; i < otzyvs.length; i++) {
            if (otzyvs[i] == null) {
                otzyvs[i] = otzyv;
                return;
            }

        }
    }

    public void printInfo() {
        System.out.printf("Товар: имя - %s, цена - %d, скидка - %d, тип - %s", nameTovar, fixPrice, discount, type);
        System.out.println();
        for (Caracteristic h : caracteristics) {
            if (h != null) {

                System.out.println(h.getKey() + ": " + h.getValue());
            }
        }

        for (Otzyv o : otzyvs) {
            if (o != null) {

                System.out.println("Отзыв от " + o.getNameClient() + ", рейтинг отзыва " + o.getRating());
            }
        }
    }

}
