package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00000_demo;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00000_demo_Test {


    _00000_demo solution;

    /*@Rule
    public Timeout globalTimeout = new Timeout(200);
*/
    @Before
    public void setUp() throws Exception {
        solution = new _00000_demo();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {1, 3, 6, 4, 1, 2};
        int actuals = solution.demo(nums);
        int expecteds = 5;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] nums = {1, 2, 3};
        int actuals = solution.demo(nums);
        int expecteds = 4;
        assertEquals(expecteds, actuals);
    }
}
