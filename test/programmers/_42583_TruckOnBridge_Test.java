package programmers;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import programmers.problems._42583_TruckOnBridge;

public class _42583_TruckOnBridge_Test {


    _42583_TruckOnBridge solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _42583_TruckOnBridge();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int[] row = {7, 4, 5, 6};

        int actuals = solution.solution(2, 10, row);
        int expecteds = 8;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[] row = {10};

        int actuals = solution.solution(100, 100, row);
        int expecteds = 101;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[] row = {10,10,10,10,10,10,10,10,10,10};

        int actuals = solution.solution(100, 100, row);
        int expecteds = 110;
        assertEquals(expecteds, actuals);
    }

}
