package codility;

import java.util.*;
import java.util.stream.IntStream;

public class _smallestPositiveInteger {

    public int solution(int[] A) {

        int[] ints = Arrays.stream(A).filter(e -> e > 0).sorted().toArray();
        int result = 1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == result) {
                result++;
            }
            if (ints[i] > result) {
                break;
            }
        }
        List a = new ArrayList();
        Collections.sort(a, Comparator.naturalOrder());

        return result;
    }
}
