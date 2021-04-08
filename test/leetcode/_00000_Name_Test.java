package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00000_Name;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00000_Name_Test {


    _00000_Name solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00000_Name();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int actuals = solution.problem();
        int expecteds = 49;
        assertEquals(expecteds, actuals);
    }
}
