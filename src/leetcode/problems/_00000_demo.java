package leetcode.problems;

public class _00000_demo {

    //배열안에 없는 자연수중 가장 작은것을 리턴하라.
    public int demo(int[] A) {
        int answer = 1;
        sort(A, 0, A.length - 1);
        for (int i = 0; i < A.length; i++) {

            if (A[i] == answer) {
                answer++;
            } else if (A[i] < answer) {
                continue;
            } else if (A[i] > answer) {
                return answer;
            }
        }
        return answer;
    }

    public void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        do {
            while (data[left] < pivot) {
                left++;
            }
            while (data[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);

        if (l < right) {
            sort(data, l, right);
        }
        if (r > left) {
            sort(data, left, r);
        }
    }
}
