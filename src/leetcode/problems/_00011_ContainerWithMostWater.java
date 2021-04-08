package leetcode.problems;

public class _00011_ContainerWithMostWater {

    public int maxArea(int[] height) {

        int max = 0;
        int start = 0;
        int last = height.length - 1;

        while (last - start > 0) {
            int standard = Math.min(height[last], height[start]);
            int area = (last - start) * standard;

            if (height[last] > height[start]) {
                start++;
            } else {
                last--;
            }

            max = Math.max(max, area);
        }
        return max;
    }
}
