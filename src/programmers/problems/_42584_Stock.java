package programmers.problems;

import java.util.Stack;

public class _42584_Stock {


    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            while (!s.isEmpty() && arr[s.peek()] > value) {
                answer[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }

        while(!s.isEmpty()){
            answer[s.peek()] = arr.length - s.peek() -1;
            s.pop();
        }

        return answer;
    }
}
