package leetcode

import leetcode.problems._01029_Two_City_Scheduling_Kt
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class _01029_Two_City_Scheduling_Kt_Test {
    var solution: _01029_Two_City_Scheduling_Kt? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _01029_Two_City_Scheduling_Kt()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        //[[10,20],[30,200],[400,50],[30,20]]
        val nums = arrayOf(intArrayOf(10, 20), intArrayOf(30, 200), intArrayOf(400, 50), intArrayOf(30, 20))
        val actuals = solution!!.twoCitySchedCost(nums)
        val expecteds = 110
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test1() {
        //[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
        val nums = arrayOf(
            intArrayOf(259, 770),
            intArrayOf(448, 54),
            intArrayOf(926, 667),
            intArrayOf(184, 139),
            intArrayOf(840, 118),
            intArrayOf(577, 469)
        )
        val actuals = solution!!.twoCitySchedCost(nums)
        val expecteds = 1859
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test2() {
        //[[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]
        val nums = arrayOf(
            intArrayOf(515, 563),
            intArrayOf(451, 713),
            intArrayOf(537, 709),
            intArrayOf(343, 819),
            intArrayOf(855, 779),
            intArrayOf(457, 60),
            intArrayOf(650, 359),
            intArrayOf(631, 42)
        )
        val actuals = solution!!.twoCitySchedCost(nums)
        val expecteds = 3086
        Assert.assertEquals(expecteds, actuals)
    }
}