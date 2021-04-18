package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00005_LongestPalindromicSubstring;
import leetcode.problems._00006_ZIGZAG;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00005_LongestPalindromicSubstring_Test {


    _00005_LongestPalindromicSubstring solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00005_LongestPalindromicSubstring();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        String s = "cbbd";
        String actuals = solution.longestPalindrome(s);
        String expecteds = "bb";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        String s = "a";
        String actuals = solution.longestPalindrome(s);
        String expecteds = "a";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        String s = "ac";
        String actuals = solution.longestPalindrome(s);
        String expecteds = "a";
        assertEquals(expecteds, actuals);
    }
}
