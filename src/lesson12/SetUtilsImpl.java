package lesson12;

import java.util.*;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        SortedSet<String> resultUnion = new TreeSet<>();

      //  resultUnion.addAll(collection1);
        resultUnion.addAll(set2);
        return resultUnion;

    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        Random random = new Random(5);
        SortedSet<Integer> numbersSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            numbersSet.add(random.nextInt(10));
        }
        return numbersSet;
    }
}
