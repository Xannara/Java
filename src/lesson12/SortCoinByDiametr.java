package lesson12;

import lesson11.Coin;

import java.util.Comparator;

public class SortCoinByDiametr implements Comparator<Coin> {
// чтобы изменить порядок полей сортировки нужно поменять местами if'ы
    @Override
    public int compare(Coin o1, Coin o2) {
        int nom1 = o1.getNominal();
        int nom2 = o2.getNominal();

        if (o1.getNominal() != o2.getNominal()) {
            return nom1 - nom2;
        }
// короткий вариант (без объявления перемнных)
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        return o1.getDiametr() - o2.getDiametr();
    }
}
