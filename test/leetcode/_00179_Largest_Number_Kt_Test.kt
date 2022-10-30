package leetcode

import leetcode.problems._00179_Largest_Number_Kt
import org.junit.*

class _00179_Largest_Number_Kt_Test {
    var solution: _00179_Largest_Number_Kt? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _00179_Largest_Number_Kt()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        val nums = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val actuals = solution!!.largestNumber(nums)
        val expecteds = "887654321"
        Assert.assertEquals(expecteds, actuals)
    }
}