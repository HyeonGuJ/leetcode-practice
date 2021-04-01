package problems._00012_IntegertoRoman;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {


    problems._00012_IntegertoRoman.Solution solution;

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
        int nums = 1994;
        String actuals = solution.intToRoman(nums);
        String expecteds = "MCMXCIV";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int nums = 58;
        String actuals = solution.intToRoman(nums);
        String expecteds = "LVIII";
        assertEquals(expecteds, actuals);
    }
    @Test
    public void Test2() {
        int nums = 3;
        String actuals = solution.intToRoman(nums);
        String expecteds = "III";
        assertEquals(expecteds, actuals);
    }
}
