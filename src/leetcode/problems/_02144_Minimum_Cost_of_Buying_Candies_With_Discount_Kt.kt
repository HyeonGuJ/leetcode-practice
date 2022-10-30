package leetcode.problems

class _02144_Minimum_Cost_of_Buying_Candies_With_Discount_Kt {

    fun minimumCost(cost: IntArray): Int {
        return cost.sortedDescending()
            .filterIndexed { index, i -> (index + 1) % 3 != 0 }
            .sum()
    }
}