package programmers.problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _42626_MoreHot {


    public int solution(int[] scoville, int K) {


        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            heap.offer(scoville[i]);
        }

        int count = 0;
        while (true) {

            if (heap.peek() >= K) {
                return count;
            }
            if (heap.size() == 1) {
                return -1;
            }
            Integer first = heap.poll();
            Integer second = heap.poll();

            heap.offer(first + second * 2);
            count++;
        }


    }
}
