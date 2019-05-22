package lesson7;

public class HomeDrobnoeChislo {
    private int chislitel;
    private int znamenatel = 1;

    public void setChislitel(int chislitel) {
        this.chislitel = chislitel;
    }

    public void setZnamenatel(int znamenatel) {
        if (znamenatel == 0) {
            System.out.println("Знаменатель не может быть 0");
        } else {
            this.znamenatel = znamenatel;
        }
    }

    public int getZnamenatel() {
        return this.znamenatel;
    }

    public int getChislitel () {
        return this.chislitel;
    }

    public void printInfo () {

        System.out.printf("%d/%d", chislitel, znamenatel);
        System.out.println();
    }
}
