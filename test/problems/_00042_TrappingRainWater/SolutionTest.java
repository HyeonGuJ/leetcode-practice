package problems._00042_TrappingRainWater;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {


    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int actuals = solution.trap(nums);
        int expecteds = 6;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] nums = {4, 2, 0, 3, 2, 5};
        int actuals = solution.trap(nums);
        int expecteds = 9;
        assertEquals(expecteds, actuals);
    }

}
