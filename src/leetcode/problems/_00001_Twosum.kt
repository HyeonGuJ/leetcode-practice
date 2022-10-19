package leetcode.problems

class _00001_Twosum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberMap = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, i ->
            if (numberMap.containsKey(target - i)) {
                return intArrayOf(numberMap[target - i]!!, index).sortedArray()
            } else {
                numberMap[i] = index
            }
        }
        return intArrayOf()
    }
}