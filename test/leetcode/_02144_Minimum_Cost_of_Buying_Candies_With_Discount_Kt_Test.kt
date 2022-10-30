package leetcode

import leetcode.problems._00000_Name_Kt
import leetcode.problems._02144_Minimum_Cost_of_Buying_Candies_With_Discount_Kt
import org.junit.*

class _02144_Minimum_Cost_of_Buying_Candies_With_Discount_Kt_Test {
    var solution: _02144_Minimum_Cost_of_Buying_Candies_With_Discount_Kt? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _02144_Minimum_Cost_of_Buying_Candies_With_Discount_Kt()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        val nums = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val actuals = solution!!.minimumCost(nums)
        val expecteds = 8+8+6+5+3+2
        Assert.assertEquals(expecteds, actuals)
    }
    @Test
    fun Test1() {
        val nums = intArrayOf(1,2,3)
        val actuals = solution!!.minimumCost(nums)
        val expecteds = 5
        Assert.assertEquals(expecteds, actuals)
    }
    @Test
    fun Test2() {
        val nums = intArrayOf(6,5,7,9,2,2)
        val actuals = solution!!.minimumCost(nums)
        val expecteds = 23
        Assert.assertEquals(expecteds, actuals)
    }
}