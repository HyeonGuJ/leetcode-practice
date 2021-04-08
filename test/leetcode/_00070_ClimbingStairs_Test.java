package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00070_ClimbingStairs;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00070_ClimbingStairs_Test {


    _00070_ClimbingStairs solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00070_ClimbingStairs();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {

        int x = 2;
        int actuals = solution.climbStairs(x);
        int expecteds = 2;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {

        int x = 3;
        int actuals = solution.climbStairs(x);
        int expecteds = 3;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {

        int x = 4;
        int actuals = solution.climbStairs(x);
        int expecteds = 5;
        assertEquals(expecteds, actuals);
    }


    @Test
    public void Test3() {

        int x = 5;
        int actuals = solution.climbStairs(x);
        int expecteds = 8;
        assertEquals(expecteds, actuals);
    }
}
