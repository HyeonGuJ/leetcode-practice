package problems._00050_POW;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {


    problems._00050_POW.Solution solution;

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
        double x = 2.00000;
        int n = -2;
        double actuals = solution.myPow(x, n);
        double expecteds = 0.25000;
        assertEquals(expecteds, actuals, 0.000001);
    }

    @Test
    public void Test1() {
        double x = 2.10000;
        int n = 3;
        double actuals = solution.myPow(x, n);
        double expecteds = 9.26100;
        assertEquals(expecteds, actuals, 0.000001);

    }
}
