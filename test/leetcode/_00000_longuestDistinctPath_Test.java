package leetcode;

import static org.junit.Assert.assertEquals;

import leetcode.problems._00000_longestDistinctPath;
import leetcode.structure.CodilityTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class _00000_longuestDistinctPath_Test {


    _00000_longestDistinctPath solution;

    /*@Rule
    public Timeout globalTimeout = new Timeout(200);
*/
    @Before
    public void setUp() throws Exception {
        solution = new _00000_longestDistinctPath();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //         8
    //      /     \
    //     6       18
    //   /   \     / \
    //  3     7   10  20
    //   \
    //     5
    //    /
    //    4

    @Test
    public void Test0() {
        CodilityTree tree = CodilityTree.getTree11();
        int actuals = solution.solution(tree);
        int expecteds = 5;
        assertEquals(expecteds, actuals);
    }

    //          1
    //            \
    //             2
    //            / \
    //           1   1
    //              /
    //             4

    @Test
    public void Test1() {
        CodilityTree tree = CodilityTree.getTree17();
        int actuals = solution.solution(tree);
        int expecteds = 2;
        assertEquals(expecteds, actuals);
    }

    //          1
    //            \
    //             1

    @Test
    public void Test2() {
        CodilityTree tree = CodilityTree.getTree18();
        int actuals = solution.solution(tree);
        int expecteds = 1;
        assertEquals(expecteds, actuals);
    }

}
