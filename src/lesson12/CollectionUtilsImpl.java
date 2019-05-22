package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements nedis.study.interfaces.t5.collections.CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> resultUnion = new ArrayList<>();
        resultUnion.addAll(a);
        resultUnion.addAll(b);
        return resultUnion;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> resultIntersection = new ArrayList<>();
        for (Integer num: a) {
            if (b.contains(num)) {
                resultIntersection.add(num);
            }
        }

        for (Integer num: b) {
            if (a.contains(num)) {
                resultIntersection.add(num);
            }
        }
        return resultIntersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> resultUnionWithoutDuplicate = new HashSet<Integer>();
        resultUnionWithoutDuplicate.addAll(a);
        resultUnionWithoutDuplicate.addAll(b);
        return resultUnionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> resultIntersectionWithoutDuplicate = new HashSet<Integer>();
        resultIntersectionWithoutDuplicate.addAll(a);
        resultIntersectionWithoutDuplicate.retainAll(b);
        return resultIntersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num: a) {
            if (!b.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num: b) {
            if (!a.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
