package leetcode.problems

import kotlin.math.abs


class _00015_3Sum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()
        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var l = i + 1
            var r = nums.size - 1
            while (l < r) {
                val sum = nums[i] + nums[l] + nums[r]
                when {
                    sum == 0 -> {
                        result.add(listOf(nums[i], nums[l], nums[r]))
                        while (l < r && nums[l] == nums[l + 1]) l++
                        while (l < r && nums[r] == nums[r - 1]) r--
                        l++
                        r--
                    }
                    sum < 0 -> l++
                    else -> r--
                }
            }
        }
        return result
    }
}