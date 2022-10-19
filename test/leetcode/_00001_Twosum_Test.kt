package leetcode

import leetcode.problems._00000_Name_Kt
import leetcode.problems._00001_Twosum
import org.junit.*
import org.junit.rules.Timeout

class _00001_Twosum_Test {
    var solution: _00001_Twosum? = null

    @JvmField
    @Rule
    val globalTimeout = Timeout(2000)

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _00001_Twosum()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        val nums = intArrayOf(3,6,8,11)
        val target = 9
        val actuals = solution!!.twoSum(nums, target)
        val expecteds = intArrayOf(0,1)
        Assert.assertArrayEquals(expecteds, actuals)
    }

    @Test
    fun Test1() {
        val nums = intArrayOf(3,3)
        val target = 6
        val actuals = solution!!.twoSum(nums, target)
        val expecteds = intArrayOf(0,1)
        Assert.assertArrayEquals(expecteds, actuals)
    }
    @Test
    fun Test2() {
        val nums = intArrayOf(3,2,4)
        val target = 6
        val actuals = solution!!.twoSum(nums, target)
        val expecteds = intArrayOf(1,2)
        Assert.assertArrayEquals(expecteds, actuals)
    }
}