package lesson13;

public class MainTeam {
    public static void main(String[] args) {
        Tournir tournir = new Tournir();
        tournir.addTeam("Спартак", 3);
        tournir.addTeam("ЦСКА", 5);
        tournir.addTeam("Динамо", 10);
        tournir.addTeam("Спартак", 4);
        tournir.addTeam("Челси", 15);

        tournir.printTable();
        tournir.printWinner();
        tournir.printFail();
        tournir.sortPoint();

    }
}
