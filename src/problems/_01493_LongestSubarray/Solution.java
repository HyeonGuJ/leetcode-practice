package problems._01493_LongestSubarray;

public class Solution {

    public int longestSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int count = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                count++;
            }

            while (count > 1) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }

            max = Math.max(max, right - left);
        }
        return max;
    }
}
