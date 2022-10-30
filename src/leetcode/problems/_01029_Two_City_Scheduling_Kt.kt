package leetcode.problems

import kotlin.math.abs

class _01029_Two_City_Scheduling_Kt {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {

        val comp = Comparator<IntArray> { first, second ->
             abs(second[0] - second[1])- abs(first[0] - first[1])
        }

        val sorted = costs.toList().sortedWith(comp)

        val max = sorted.size / 2
        var left = 0
        var right = 0
        var sum = 0

        for (it: Int in sorted.indices) {
            println(it)
            if (left == max) {
                println(sorted[it][1])
                sum += sorted[it][1]
                right++
                continue
            } else if (right == max) {
                println(sorted[it][0])
                sum += sorted[it][0]
                left++
                continue
            }

            if (sorted[it][0] < sorted[it][1]) {
                println(sorted[it][0])
                sum += sorted[it][0]
                left++
                continue
            } else {
                println(sorted[it][1])
                sum += sorted[it][1]
                right++
                continue
            }
        }

        return sum

    }
}