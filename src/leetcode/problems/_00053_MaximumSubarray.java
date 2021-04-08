package leetcode.problems;

public class _00053_MaximumSubarray {

    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int max = 0;
        int answer = nums[0];
        for (int i = 0; i < nums.length; i++) {

            max = Math.max(nums[i], max + nums[i]);
            answer = Math.max(max, answer);
        }
        return answer;
    }
}
