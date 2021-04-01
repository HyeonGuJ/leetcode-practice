/**
 * Time : O(N) ; Space: O(N)
 * @tag : Array; Hash Table
 * @by  : Steven Cooks
 * @date: Apr 30, 2015
 ***************************************************************************
 * Description:
 * Given an array of integers, find two numbers such that they add up to 
 * a specific target number. 
 * The function twoSum should return indices of the two numbers such that 
 * they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not 
 * zero-based. 
 *
 * You may assume that each input would have exactly one solution. 
 * Input: numbers={2, 7, 11, 15}, target=9 
 * Output: index1=1, index2=2
 *
 ***************************************************************************
 * {@link https://leetcode.com/problems/two-sum/ }
 */
package _01493_LongestSubarray;

/** see test {@link _01493_LongestSubarray.SolutionTest } */
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
