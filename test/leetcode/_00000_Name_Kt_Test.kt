package leetcode

import leetcode.problems._00000_Name_Kt
import org.junit.*
import org.junit.rules.Timeout

class _00000_Name_Kt_Test {
    var solution: _00000_Name_Kt? = null

    @Rule
    var globalTimeout = Timeout(200)
    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _00000_Name_Kt()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        val nums = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val actuals = solution!!.problem()
        val expecteds = 49
        Assert.assertEquals(expecteds, actuals)
    }
}