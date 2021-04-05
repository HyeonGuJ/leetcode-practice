package problems;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00200_NumberofIslands_Test {


    _00200_NumberofIslands solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00200_NumberofIslands();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int actuals = solution.numIslands(grid);
        int expecteds = 1;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int actuals = solution.numIslands(grid);
        int expecteds = 3;
        assertEquals(expecteds, actuals);
    }


    @Test
    public void Test2() {
        char[][] grid = {
            {'1'}, {'1'}
        };
        int actuals = solution.numIslands(grid);
        int expecteds = 1;
        assertEquals(expecteds, actuals);
    }

}
