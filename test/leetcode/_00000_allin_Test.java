package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00000_allin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class _00000_allin_Test {


    _00000_allin solution;

    /*@Rule
    public Timeout globalTimeout = new Timeout(200);
*/
    @Before
    public void setUp() throws Exception {
        solution = new _00000_allin();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        int num1 = 8;
        int num2 = 0;
        int actuals = solution.solution(num1,num2);
        int expecteds = 7;

        assertEquals(expecteds, actuals);
    }


    @Test
    public void Test1() {
        int num1 = 18;
        int num2 = 2;
        int actuals = solution.solution(num1,num2);
        int expecteds = 6;

        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int num1 = 10;
        int num2 = 10;
        int actuals = solution.solution(num1,num2);
        int expecteds = 4;

        assertEquals(expecteds, actuals);
    }
}
