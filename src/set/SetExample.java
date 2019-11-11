package set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Set<Integer> set = new TreeSet<Integer>();     // empty
        Set<String> set2 = new HashSet<String>(names);
        Set<String> set3 = new LinkedHashSet<>(names);

        //how to enumerate set when there is no get(i) method??
    }
}
