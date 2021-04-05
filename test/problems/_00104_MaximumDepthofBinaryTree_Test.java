package problems;

import static org.junit.Assert.assertEquals;

import com.structure.TreeNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _00104_MaximumDepthofBinaryTree_Test {


    _00104_MaximumDepthofBinaryTree solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _00104_MaximumDepthofBinaryTree();
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
        TreeNode tree = TreeNode.getTree11();
        int actuals = solution.maxDepth(tree);
        int expecteds = 5;
        assertEquals(expecteds, actuals);
    }

    //   1
    //    \
    //     2
    //      \
    //       3
    @Test
    public void Test1() {
        TreeNode tree = TreeNode.getTree1();
        int actuals = solution.maxDepth(tree);
        int expecteds = 3;
        assertEquals(expecteds, actuals);
    }

}
