package leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _00000_mda {

    public int solution(int[] array) {

        SavedData dfs = dfs(array);
        return dfs.count;
    }

    public SavedData dfs(int[] array) {
        if (array.length == 0) {
            SavedData data = new SavedData(null, 0);
            return data;
        }

        int nowValue = array[0];
        int[] subArr = IntStream.range(1, array.length)
                                .map(i -> array[i])
                                .toArray();

        SavedData subData = dfs(subArr);
        if (subData.count == -1) {
            return subData;
        }
        int count = subData.count;
        if (count >= 100000000) {
            subData.count = -1;
            return subData;
        }

        List<Integer> list = new ArrayList<>();
        for (Integer sum : subData.sums) {
            int nowSum = nowValue + sum;
            list.add(nowSum);
            if (nowSum == 0) {
                count++;
            }
        }

        if (nowValue == 0) {
            count++;
        }
        list.add(nowValue);

        return new SavedData(list, count);

    }

    class SavedData {

        List<Integer> sums;
        int count;

        public SavedData(List<Integer> sums, int count) {
            if (sums == null) {
                this.sums = new ArrayList<>();
            } else {
                this.sums = sums;
            }

            this.count = count;
        }

    }

}
