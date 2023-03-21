package programmers.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class _161988_SequancialPulse {


    public long solution(int[] sequence) {


        long[] sum = new long[sequence.length + 1];
        for (int i = 1; i < sum.length; i++) {
            if (i % 2 == 0) {
                sum[i] = sum[i - 1] + (long) sequence[i - 1] * -1;
            } else {
                sum[i] = sum[i - 1] + (long) sequence[i - 1];
            }
        }

        List<Long> sums = LongStream.of(sum).boxed().collect(Collectors.toList());
        System.out.println(sums);
        return Math.abs(Collections.max(sums) - Collections.min(sums));
    }

    public long solution2(int[] sequence) {
        List<Long> pulsed = new ArrayList<>();
        for (int i = 0; i < sequence.length; i++) {
            if (i % 2 == 0) {
                pulsed.add(Long.valueOf(sequence[i]));
            } else {
                pulsed.add(Long.valueOf(sequence[i] * -1));
            }
        }
        System.out.println(pulsed);

        List<Long> sums = new ArrayList<>();
        sums.add(0L);
        long sum = 0;
        for (int i = 0; i < pulsed.size(); i++) {

            sum += pulsed.get(i);
            sums.add(sum);
        }
        System.out.println(sums);
        return Math.abs(Collections.max(sums) - Collections.min(sums));
    }
}
