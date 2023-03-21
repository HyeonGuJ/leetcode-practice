package programmers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import programmers.problems._161988_SequancialPulse;

import static org.junit.Assert.assertEquals;

public class _161988_SequancialPulse_Test {


    _161988_SequancialPulse solution;


    @Before
    public void setUp() throws Exception {
        solution = new _161988_SequancialPulse();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {

        int[] inpit = {2, 3, -6, 1, 3, -1, 2, 4};

        long actual = solution.solution(inpit);
        System.out.println("----");
        long actual2 = solution.solution2(inpit);
        long expected = 10;
        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

}
