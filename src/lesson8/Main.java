package lesson8;

public class Main {
    public static void main(String[] args) {
        Tovar blender = new Tovar();
        blender.setNameTovar("Phillips");
        blender.setId_tovar(12345);
        blender.setFixPrice(12200);
        blender.setDiscount(19);
        blender.setAvaliable(true);


        Caracteristic volume = new Caracteristic();
        volume.setKey("Объем");
        volume.setValue("0.8");

        Caracteristic color = new Caracteristic();
        color.setKey("Цвет");
        color.setValue("белый");

        blender.addCaracteristic(volume);
        blender.addCaracteristic(color);

        Otzyv otzyv1 = new Otzyv();
        otzyv1.setAge(35);
        otzyv1.setByeInOzon(true);
        otzyv1.setComment("this model...");
        otzyv1.setLike(7);
        otzyv1.setDislike(4);
        otzyv1.setPlus("all simple...");
        otzyv1.setMinus("laut");
        otzyv1.setNameClient("John Smith");

        blender.addOtzyv(otzyv1);
        blender.printInfo();


    }
}
