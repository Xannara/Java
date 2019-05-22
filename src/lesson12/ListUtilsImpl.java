package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> strings1 = new ArrayList<String>();
        strings.toString().replaceAll("[\\[.\\].\\s+]", "");
        System.out.println(strings);
        return strings1;
    }



    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        List<Double> sorted = new ArrayList<>();
        Collections.sort(data);
        Collections.reverse(data);
        return sorted;
    }

}
