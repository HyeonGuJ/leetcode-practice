package leetcode.problems

class _02439_Minimize_Maximum_Of_Array {
    fun minimizeArrayValue(nums: IntArray): Int {

        val list = nums.toMutableList()

        var sum = list[0].toLong()
        var max = list[0].toLong()
        var i = 1
        while (i < list.size) {
            if (list[i] > max) {
                sum += nums[i].toLong()
                max = max.coerceAtLeast((sum + i) / (i + 1))
            }
            sum += list[i]
            i++
        }
        return max.toInt()

    }
}