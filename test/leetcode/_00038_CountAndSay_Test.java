package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00038_CountAndSay;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00038_CountAndSay_Test {


    _00038_CountAndSay solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00038_CountAndSay();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {

        int x = 1;
        String actuals = solution.countAndSay(x);
        String expecteds = "1";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {

        int x = 2;
        String actuals = solution.countAndSay(x);
        String expecteds = "11";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {

        int x = 9;
        String actuals = solution.countAndSay(x);
        String expecteds = "31131211131221";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {

        int x = 10;
        String actuals = solution.countAndSay(x);
        String expecteds = "13211311123113112211";
        assertEquals(expecteds, actuals);
    }


    @Test
    public void Test3() {

        int x = 5;
        String actuals = solution.countAndSay(x);
        String expecteds = "111221";
        assertEquals(expecteds, actuals);
    }
}
