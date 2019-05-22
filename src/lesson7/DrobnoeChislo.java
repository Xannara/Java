package lesson7;

public class DrobnoeChislo {
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
        return chislitel;
    }

    public void printInfo () {
        int tseloe = chislitel / znamenatel;
        int ostatok = chislitel % znamenatel;

        System.out.printf("%d %d/%d", tseloe, ostatok, znamenatel);
        System.out.println();
    }
}
