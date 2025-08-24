package Interview.Immutable;

import java.util.HashSet;
import java.util.Set;

public class OutImmutableTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        ImmutableClass immutableClass = new ImmutableClass(0,"ritu",set);
        set.add(7);
        int id = immutableClass.getId();
        String name = immutableClass.getName();
        Set<Integer> objSet = immutableClass.getSet();
        System.out.println(immutableClass.getSet());
    }
}
