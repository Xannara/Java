package lesson13;

import java.util.*;

public class Tournir {
    private String nameTournir;
    private HashMap<String, Integer> teams = new HashMap<>();

    public Tournir () {

    }

    public Tournir (String name) {
        nameTournir = name;
    }

    public String getNameTournir() {
        return nameTournir;
    }

    public void setNameTournir(String nameTournir) {
        this.nameTournir = nameTournir;
    }

    public void addTeam (String nameTeam, int point) {
       if (teams.containsKey(nameTeam)) {
           int currentPoint = teams.get(nameTeam);
           teams.put(nameTeam, point + currentPoint);
       } else {
           teams.put(nameTeam, point);
       }
    }

    public void printTable () {
        System.out.println("Турнирная таблица: ");
        for (String key: teams.keySet()) {
            System.out.println(key + " " + teams.get(key));
        }
        System.out.println();
    }

    public void printWinner () {
        int max = 0;
        String nameWinner = " ";
        for (String key: teams.keySet()) {
            if (teams.get(key) > max) {
                max = teams.get(key);
                nameWinner = key;
            }
        }
        System.out.println("Победитель: " + nameWinner + " " + max);
        System.out.println();
    }

    public void printFail () {
        int min = Integer.MAX_VALUE;     // максимальное значение типа Integer
        String nameFail = " ";
        for (String key: teams.keySet()) {
            if (teams.get(key) < min) {
                min = teams.get(key);
                nameFail = key;
            }
        }
        System.out.println("Проигравший: " + nameFail + " " + min);
        System.out.println();
    }
// ДЗ написать сортировку таблицы по убыванию (поискать по паре "ключ-значение")
    public void sortPoint () {
// сортировка по убыванию
        System.out.println("сортировка по убыванию");
        teams.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println();
// сортировка по возрастанию
        System.out.println("сортировка по возрастанию");
        teams.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
    /*  ArrayList<Integer> points = new ArrayList<Integer>(teams.values());  // достали значения и поместили в ArrayList
        Collections.sort(points);
        Collections.reverse(points);*/

      /*  String nameTeam1 = teams.get(nameTeam);
        for (Integer num : points) {
      //      for (String key : teams.keySet()) {
           //     nameTeam = key;
                System.out.println(nameTeam1 + " " + num);
                // System.out.println(points);
            }*/
}
