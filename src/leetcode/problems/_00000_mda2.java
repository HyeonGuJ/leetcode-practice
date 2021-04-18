package leetcode.problems;

public class _00000_mda2 {

    public int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n-1 ; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }

        int r = -2;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }
}