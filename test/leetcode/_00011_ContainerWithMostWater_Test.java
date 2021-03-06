package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00011_ContainerWithMostWater;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00011_ContainerWithMostWater_Test {


    _00011_ContainerWithMostWater solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00011_ContainerWithMostWater();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int actuals = solution.maxArea(nums);
        int expecteds = 49;
        assertEquals(expecteds, actuals);
    }

}
