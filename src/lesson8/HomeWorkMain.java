package lesson8;

public class HomeWorkMain {
    public static void main(String[] args) {
        HomeWorkProduct camera = new HomeWorkProduct();
        camera.setProductId(111);
        camera.setNameProduct("Aceline S-40");
        camera.setPrice(1499);
        camera.setQuantityAvailable(17);
        camera.setDeliverToHome("сегодня");

        // заполнение характеристик данными
        HomeWorkCharacteristic maximumVideoResolution = new HomeWorkCharacteristic();
        maximumVideoResolution.setKey("Максимальное разрешение видеосъемки");
        maximumVideoResolution.setValue("1920x1080");

        HomeWorkCharacteristic viewingAngle = new HomeWorkCharacteristic();
        viewingAngle.setKey("Угол обзора");
        viewingAngle.setValue("120 град.");

        HomeWorkCharacteristic imageStabilization = new HomeWorkCharacteristic();
        imageStabilization.setKey("Стабилизация изображения");
        imageStabilization.setValue("нет");

        HomeWorkCharacteristic underwaterBox = new HomeWorkCharacteristic();
        underwaterBox.setKey("Подводный бокс в комплекте");
        underwaterBox.setValue("есть");

        //добавление характирестик
        camera.addCharacteristic(maximumVideoResolution);
        camera.addCharacteristic(viewingAngle);
        camera.addCharacteristic(imageStabilization);
        camera.addCharacteristic(underwaterBox);

        HomeWorkComment comment1 =new HomeWorkComment();
        comment1.setNameClient("Дмитрий");
        comment1.setDateComment("25.03.2019");
        comment1.setRating(4.9);
        comment1.setComment("Процавец-консультант сказал, что отстаёт звук, но это не правда всё работает отлично!");
        comment1.setLike(24);
        comment1.setDislike(0);
        comment1.setPlus("Хороший звук, качество видео отличное за эту цену");
        comment1.setMinus("Пока не обноружил");

        camera.addComment(comment1);
        camera.printInfo();

    }
}
