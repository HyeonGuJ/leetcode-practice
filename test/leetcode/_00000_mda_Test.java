package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00000_mda;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class _00000_mda_Test {


    _00000_mda solution;

    /*@Rule
    public Timeout globalTimeout = new Timeout(200);
*/
    @Before
    public void setUp() throws Exception {
        solution = new _00000_mda();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {2, -2, 3, 0, 4, -7};
        int actuals = solution.solution(nums);
        int expecteds = 4;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] nums = {1, 2, 3};
        int actuals = solution.solution(nums);
        int expecteds = 0;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] nums = {0};
        int actuals = solution.solution(nums);
        int expecteds = 1;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int[] nums = {2, 1, -1, -2};
        int actuals = solution.solution(nums);
        int expecteds = 2;
        assertEquals(expecteds, actuals);
    }
}
