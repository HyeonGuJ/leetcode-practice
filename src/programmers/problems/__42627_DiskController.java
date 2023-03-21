package programmers.problems;

import java.util.*;

public class __42627_DiskController {

    public int solution(int[][] jobs) {
        int total = 0;
        int now = 0;
        int index = 0;
        int length = jobs.length;
        List<int[]> list = new ArrayList<>();

        // 작업들을 요청 시간 순으로 정렬합니다.
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        // 우선순위 큐를 초기화합니다.
        while (index < length || !list.isEmpty()) {
            // 작업들을 요청 시간 순으로 처리합니다.
            while (index < length && jobs[index][0] <= now) {
                list.add(jobs[index++]);
            }

            // 작업들을 처리하는데 걸리는 시간이 짧은 순서대로 정렬합니다.
            if (list.isEmpty()) {
                now = jobs[index][0];
            } else {
                int[] job = list.stream().min(Comparator.comparingInt(a -> a[1])).get();
                list.remove(job);
                total += now + job[1] - job[0];
                now += job[1];
            }
        }

        // 평균 시간을 구합니다.
        return total / length;
    }
}
