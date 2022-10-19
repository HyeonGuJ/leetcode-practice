package leetcode

import leetcode.problems._00000_Name_Kt
import leetcode.problems._00029_DivideTwoIntegers
import org.junit.*
import org.junit.rules.Timeout

class _00029_DivideTwoIntegers_Test {
    var solution: _00029_DivideTwoIntegers? = null


    @JvmField
    @Rule
    val globalTimeout = Timeout(20000)

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _00029_DivideTwoIntegers()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {
        val num1 = 10
        val num2 = 3
        val actuals = solution!!.divide(num1, num2)
        val expecteds = 3
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test1() {
        val num1 = 7
        val num2 = -3
        val actuals = solution!!.divide(num1, num2)
        val expecteds = -2
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test2() {
        val num1 = 1
        val num2 = 1
        val actuals = solution!!.divide(num1, num2)
        val expecteds = num1/num2
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test3() {
        val num1 = 3455675
        val num2 = -51
        val actuals = solution!!.divide(num1, num2)
        val expecteds = num1/num2
        Assert.assertEquals(expecteds, actuals)
    }
    @Test
    fun Test4() {
        val num1 = -2147483648
        val num2 = -1
        val actuals = solution!!.divide(num1, num2)
        val expecteds = 2147483647
        Assert.assertEquals(expecteds, actuals)
    }
}