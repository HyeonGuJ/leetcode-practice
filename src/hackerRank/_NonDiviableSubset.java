package hackerRank;

import java.util.List;

public class _NonDiviableSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] arr = s.stream().mapToInt(e -> e).toArray();

        int[] remains = new int[k];
        for (int i = 0; i < arr.length; i++) {
            remains[arr[i] % k]++;
        }

        int result = 0;
        if (remains[0] > 0) {
            result++;
        }
        for (int i = 1; i < remains.length; i++) {
            if (i == (k - i)) {
                result++;
            } else {
                if (remains[i] >= remains[k - i]) {
                    result += remains[i];
                } else {
                    result += remains[k - i];
                }
                remains[i] = 0;
                remains[k - i] = 0;
            }
        }
        return result;
    }

}
