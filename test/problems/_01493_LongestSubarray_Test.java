package problems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import problems._01493_LongestSubarray;

public class _01493_LongestSubarray_Test {


    _01493_LongestSubarray solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _01493_LongestSubarray();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {1, 1, 1};
        int actuals = solution.longestSubarray(nums);
        int expecteds = 3;
        assertEquals(expecteds, actuals);
    }

}
