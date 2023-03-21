package programmers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import programmers.problems._154539_NextBiggerOne;

import static org.junit.Assert.assertEquals;

public class _154539_NextBiggerOne_Test {


    _154539_NextBiggerOne solution;


    @Before
    public void setUp() throws Exception {
        solution = new _154539_NextBiggerOne();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {

        int[] inpit = {9, 1, 5, 3, 6, 2};
        int[] expected = {-1, 5, 6, 6, -1, -1};

        int[] actual = solution.solution(inpit);
        assertEquals(expected, actual);
    }

}
