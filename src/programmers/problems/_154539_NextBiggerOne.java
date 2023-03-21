package programmers.problems;

import java.util.Stack;

public class _154539_NextBiggerOne {


    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            while (!s.isEmpty()) {
                if (s.peek() > value) {
                    answer[i] = s.peek();
                    break;
                } else {
                    s.pop();
                }
            }
            if (s.isEmpty()) {
                answer[i] = -1;
            }
            s.push(value);
        }
        return answer;
    }
}
