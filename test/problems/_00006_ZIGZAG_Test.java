package problems;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00006_ZIGZAG_Test {


    _00006_ZIGZAG solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00006_ZIGZAG();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        String s = "PAYPALISHIRING";
        int numRow = 3;
        String actuals = solution.convert(s, numRow);
        String expecteds = "PAHNAPLSIIGYIR";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        String s = "PAYPALISHIRING";
        int numRow = 4;
        String actuals = solution.convert(s, numRow);
        String expecteds = "PINALSIGYAHRPI";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        String s = "A";
        int numRow = 1;
        String actuals = solution.convert(s, numRow);
        String expecteds = "A";
        assertEquals(expecteds, actuals);
    }
}
