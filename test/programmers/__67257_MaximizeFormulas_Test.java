package programmers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import programmers.problems._67257_MaximizeFormulas;

import static org.junit.Assert.assertEquals;

public class __67257_MaximizeFormulas_Test {


    _67257_MaximizeFormulas solution;


    @Before
    public void setUp() throws Exception {
        solution = new _67257_MaximizeFormulas();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {

        String input = "100-200*300-500+20";

        long actual = solution.solution(input);
        long expected = 60420;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {

        String input = "50*6-3*2";

        long actual = solution.solution(input);
        long expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {

        String input = "1+2";

        long actual = solution.solution(input);
        long expected = 3;
        assertEquals(expected, actual);
    }
}
