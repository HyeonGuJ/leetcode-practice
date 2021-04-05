package problems;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00053_MaximumSubarray_Test {


    _00053_MaximumSubarray solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00053_MaximumSubarray();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int actuals = solution.maxSubArray(nums);
        int expecteds = 6;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] nums = {5, 4, -1, 7, 8};
        int actuals = solution.maxSubArray(nums);
        int expecteds = 23;
        assertEquals(expecteds, actuals);
    }

}
