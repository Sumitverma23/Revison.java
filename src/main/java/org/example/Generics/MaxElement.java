package org.example.Generics;

import java.util.List;

public class MaxElement {
    public static <T extends Comparable<T>> T maxInRange(
            List<T> list, int begin, int end) {

        T max = list.get(begin);

        for (int i = begin + 1; i <= end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}
