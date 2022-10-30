package leetcode

import leetcode.problems._02439_Minimize_Maximum_Of_Array
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class _02439_Minimize_Maximum_Of_Array_Test {
    var solution: _02439_Minimize_Maximum_Of_Array? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _02439_Minimize_Maximum_Of_Array()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        val nums = intArrayOf(4, 6, 1, 6)

        val actuals = solution!!.minimizeArrayValue(nums)
        val expecteds = 5
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test1() {
        val nums = intArrayOf(10, 1)

        val actuals = solution!!.minimizeArrayValue(nums)
        val expecteds = 10
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test3() {
        val nums = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

        val actuals = solution!!.minimizeArrayValue(nums)
        val expecteds = 5
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test4() {
        val nums = intArrayOf(1, 1, 1, 1165, 100, 15, 354, 5, 4, 14, 3, 1313, 1, 1, 1)

        val actuals = solution!!.minimizeArrayValue(nums)
        val expecteds = 1651651
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test5() {
        val nums = intArrayOf(4, 7, 2, 2, 9, 19, 16, 0, 3, 15)

        val actuals = solution!!.minimizeArrayValue(nums)
        val expecteds = 9
        Assert.assertEquals(expecteds, actuals)
    }
}