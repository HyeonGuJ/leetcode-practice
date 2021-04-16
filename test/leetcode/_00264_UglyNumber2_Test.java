package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00264_UglyNumber2;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00264_UglyNumber2_Test {


    _00264_UglyNumber2 solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00264_UglyNumber2();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int input = 10;
        int actuals = solution.nthUglyNumber(10);
        int expecteds = 12;
        assertEquals(expecteds, actuals);
    }

}
