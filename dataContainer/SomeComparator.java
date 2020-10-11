package dataContainer;

import java.util.Comparator;

public class SomeComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 != null && o2 != null) {
            return o1 - o2;
        }
        return 0;
    }
}
