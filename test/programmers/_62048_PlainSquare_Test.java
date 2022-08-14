package programmers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import programmers.problems._62048_PlainSquare;

import static org.junit.Assert.assertEquals;

public class _62048_PlainSquare_Test {


    _62048_PlainSquare solution;


    @Before
    public void setUp() throws Exception {
        solution = new _62048_PlainSquare();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {

        long w = 8;
        long h = 12;

        long actual = solution.solution(w,h);
        long expected = 80;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {

        long w = 12;
        long h = 8;

        long actual = solution.solution(w,h);
        long expected = 80;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {

        long w = 1;
        long h = 20;

        long actual = solution.solution(w,h);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {

        long w = 1024*100000;
        long h = 1024*100000;

        long actual = solution.solution(w,h);
        long expected = 1024*100000 * 1023*100000;
        assertEquals(expected, actual);
    }

}
