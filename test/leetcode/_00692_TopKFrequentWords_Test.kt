package leetcode

import leetcode.problems._00000_Name_Kt
import leetcode.problems._00692_TopKFrequentWords
import org.junit.*
import org.junit.rules.Timeout

class _00692_TopKFrequentWords_Test {
    var solution: _00692_TopKFrequentWords? = null

    @JvmField
    @Rule
    val globalTimeout = Timeout(200)

    @Before
    @Throws(Exception::class)
    fun setUp() {
        solution = _00692_TopKFrequentWords()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        solution = null
    }

    @Test
    fun Test0() {

        val words: Array<String> = listOf("i", "love", "leetcode", "i", "love", "coding").toTypedArray()

        val k = 2


        val actuals = solution!!.topKFrequent(words, k)
        val expecteds = listOf("i", "love")
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test1() {

        val words: Array<String> =
            listOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is").toTypedArray()

        val k = 4


        val actuals = solution!!.topKFrequent(words, k)
        val expecteds = listOf("the", "is", "sunny", "day")
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test2() {

        val words: Array<String> =
            listOf("a", "a", "b", "b").toTypedArray()

        val k = 2


        val actuals = solution!!.topKFrequent(words, k)
        val expecteds = listOf("a", "b")
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test3() {

        val words: Array<String> =
            listOf("b", "a", "a", "b").toTypedArray()

        val k = 2


        val actuals = solution!!.topKFrequent(words, k)
        val expecteds = listOf("a", "b")
        Assert.assertEquals(expecteds, actuals)
    }

    @Test
    fun Test4() {

        val words: Array<String> =
            listOf("b", "b", "a", "a").toTypedArray()

        val k = 2


        val actuals = solution!!.topKFrequent(words, k)
        val expecteds = listOf("a", "b")
        Assert.assertEquals(expecteds, actuals)
    }
}