package lesson7;
// сложение дробей
public class Calc {
    public DrobnoeChislo summa (DrobnoeChislo dr1, DrobnoeChislo dr2) {
        int commonZnam = dr1.getZnamenatel() * dr2.getZnamenatel();
        int commonChisl = (dr1.getChislitel() * dr2.getZnamenatel()) + (dr2.getChislitel() * dr1.getZnamenatel());

        DrobnoeChislo result = new DrobnoeChislo();
        result.setChislitel(commonChisl);
        result.setZnamenatel(commonZnam);
        return result;
    }
}
