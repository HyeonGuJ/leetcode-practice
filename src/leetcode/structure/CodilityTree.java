package leetcode.structure;


import java.util.LinkedList;
import java.util.Queue;

public class CodilityTree {

    public int x;
    public CodilityTree l;
    public CodilityTree r;

    public CodilityTree(int x) {
        this.x = x;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object that) {
        if (!(that instanceof CodilityTree)) {
            return false;
        } else {
            return this == that || isTreeSame(this, (CodilityTree) that);
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + ((Integer) x).hashCode();
        hash = 31 * hash + l.hashCode();
        hash = 31 * hash + r.hashCode();
        return hash;
    }

    /**
     * Level order traversal of tree. Fill empty nodes with "#".
     * e.g.
     *   1
     *    \   => [1, #, 2]
     *     2
     */
    public String toString() {
        String string = "[" + x + ", ";
        Queue<CodilityTree> curLevel = new LinkedList<>();
        curLevel.add(l);
        curLevel.add(r);
        while (curLevel.isEmpty() == false) {
            Queue<CodilityTree> nextLevel = new LinkedList<>();
            while (curLevel.isEmpty() == false) {
                CodilityTree node = curLevel.poll();
                if (node != null) {
                    string += node.x + ", ";
                    nextLevel.add(node.l);
                    nextLevel.add(node.r);
                } else {
                    string += "#, ";
                }
            }
            curLevel = nextLevel;
        }
        // remove the redundant ", " at the end of String result
        return string.substring(0, string.length() - 2) + "]";
    }

    /**
     * If root node is not null, then connect root with its left and right child.
     *
     * @param root root node (should not be null)
     * @param left
     * @param right
     */
    public static void connect(CodilityTree root, CodilityTree left, CodilityTree right) {
        if (root != null) {
            root.l = left;
            root.r = right;
        }
    }

    public static String toString(CodilityTree root) {
        String string = "";
        Queue<CodilityTree> curLevel = new LinkedList<>();
        curLevel.add(root);
        while (curLevel.isEmpty() == false) {
            Queue<CodilityTree> nextLevel = new LinkedList<>();
            String nextLine = "";
            while (curLevel.isEmpty() == false) {
                CodilityTree node = curLevel.poll();
                string += node.x;
                if (node.l != null) {
                    nextLine += "/  ";
                    nextLevel.add(node.l);
                }
                if (node.r != null) {
                    nextLine += "/  ";
                    nextLevel.add(node.r);
                }
            }
            string += "\n";
            string += nextLine;
            curLevel = nextLevel;
        }
        // remove the redundant ", " at the end of String result
        return string;
    }

    /**
     * Whether two trees are the same.
     *
     * @param p
     * @param q
     * @return true if two trees are the same.
     */
    public static boolean isSameTree(CodilityTree p, CodilityTree q) {
        if (p == null && q == null) {
            // base case: 1) root is null 2) reaching leaf's child
            return true;
        }
        if (p != null && q != null) {
            return (p.x == q.x && // compare roots' values
                isSameTree(p.l, q.l) && // compare left subtrees
                isSameTree(p.r, q.r)); // compare right subtrees
        } else {
            // is only of root is null, return false
            return false;
        }
    }

    // null
    public static CodilityTree getEmptyBST() {
        return null;
    }

    //   1
    public static CodilityTree getBST1() {
        return getTree0();
    }

    //   1
    //    \
    //     2
    //      \
    //       3
    public static CodilityTree getBST2() {
        return getTree1();
    }

    //      3
    //     /
    //    2
    //   /
    //  1
    public static CodilityTree getBST3() {
        return getTree21();
    }

    //      2
    //    /   \
    //   1     3
    public static CodilityTree getBST4() {
        return getTree31();
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    public static CodilityTree getBST5() {
        return getTree5();
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
    public static CodilityTree getBST6() {
        return getTree11();
    }

    //       4
    //     /    \
    //    2      6
    //   / \    / \
    //  1   3  5   7
    public static CodilityTree getBST7() {
        CodilityTree n1 = new CodilityTree(1);
        CodilityTree n2 = new CodilityTree(2);
        CodilityTree n3 = new CodilityTree(3);
        CodilityTree n4 = new CodilityTree(4);
        CodilityTree n5 = new CodilityTree(5);
        CodilityTree n6 = new CodilityTree(6);
        CodilityTree n7 = new CodilityTree(7);
        CodilityTree.connect(n4, n2, n6);
        CodilityTree.connect(n2, n1, n3);
        CodilityTree.connect(n6, n5, n7);
        CodilityTree root = n4;
        return root;
    }

    // 1
    public static CodilityTree getTree0() {
        CodilityTree root = new CodilityTree(1);
        return root;
    }

    //   1
    //    \
    //     2
    //      \
    //       3
    // length; search tree; balanced
    //    3        true       false
    public static CodilityTree getTree1() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(2);
        CodilityTree t3 = new CodilityTree(3);
        CodilityTree.connect(t1, null, t2);
        CodilityTree.connect(t2, null, t3);
        return t1;
    }

    //      1
    //     /
    //    2
    //   /
    //  3
    // length; search tree; balanced
    //    3        false      false
    public static CodilityTree getTree2() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t3 = new CodilityTree(2);
        CodilityTree t4 = new CodilityTree(3);
        CodilityTree.connect(t1, t3, null);
        CodilityTree.connect(t3, t4, null);
        CodilityTree root = t1;
        return root;
    }

    //      3
    //     /
    //    2
    //   /
    //  1
    // length; search tree; balanced
    //    3        true      false
    public static CodilityTree getTree21() {
        CodilityTree t1 = new CodilityTree(3);
        CodilityTree t3 = new CodilityTree(2);
        CodilityTree t4 = new CodilityTree(1);
        CodilityTree.connect(t1, t3, null);
        CodilityTree.connect(t3, t4, null);
        CodilityTree root = t1;
        return root;
    }

    //      1
    //    /   \
    //   2     3
    // length; search tree; balanced
    //    2        false      true
    public static CodilityTree getTree3() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(2);
        CodilityTree t3 = new CodilityTree(3);
        CodilityTree.connect(t1, t2, t3);
        return t1;
    }

    //      2
    //    /   \
    //   1     3
    // length; search tree; balanced
    //    2        true      true
    public static CodilityTree getTree31() {
        CodilityTree t1 = new CodilityTree(2);
        CodilityTree t2 = new CodilityTree(1);
        CodilityTree t3 = new CodilityTree(3);
        CodilityTree.connect(t1, t2, t3);
        return t1;
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    // length; search tree; balanced
    //    4        false      false
    public static CodilityTree getTree4() {
        CodilityTree t1 = new CodilityTree(5);
        CodilityTree t2 = new CodilityTree(4);
        CodilityTree t3 = new CodilityTree(8);
        CodilityTree t4 = new CodilityTree(11);
        CodilityTree t5 = new CodilityTree(13);
        CodilityTree t6 = new CodilityTree(4);
        CodilityTree t7 = new CodilityTree(7);
        CodilityTree t8 = new CodilityTree(2);
        CodilityTree t9 = new CodilityTree(5);
        CodilityTree t10 = new CodilityTree(1);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, t4, null);
        CodilityTree.connect(t3, t5, t6);
        CodilityTree.connect(t4, t7, t8);
        CodilityTree.connect(t6, t9, t10);
        CodilityTree root = t1;
        return root;
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    // length; search tree; balanced
    //    3        true       true
    public static CodilityTree getTree5() {
        CodilityTree t1 = new CodilityTree(10);
        CodilityTree t2 = new CodilityTree(5);
        CodilityTree t3 = new CodilityTree(12);
        CodilityTree t4 = new CodilityTree(4);
        CodilityTree t5 = new CodilityTree(7);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, t4, t5);
        CodilityTree root = t1;
        return root;
    }

    //          5
    //         /
    //       4
    //      /
    //     3
    //    /
    //   2
    //  /
    // 1
    // length; search tree; balanced
    //    5        true       false
    public static CodilityTree getTree6() {
        CodilityTree t1 = new CodilityTree(5);
        CodilityTree t2 = new CodilityTree(4);
        CodilityTree t3 = new CodilityTree(3);
        CodilityTree t4 = new CodilityTree(2);
        CodilityTree t5 = new CodilityTree(1);
        CodilityTree.connect(t1, t2, null);
        CodilityTree.connect(t2, t3, null);
        CodilityTree.connect(t3, t4, null);
        CodilityTree.connect(t4, t5, null);
        CodilityTree root = t1;
        return root;
    }

    //   5
    //    \
    //     4
    //      \
    //       3
    //        \
    //         2
    //          \
    //           1
    // length; search tree; balanced
    //    5        false     false
    public static CodilityTree getTree7() {
        CodilityTree t1 = new CodilityTree(5);
        CodilityTree t2 = new CodilityTree(4);
        CodilityTree t3 = new CodilityTree(3);
        CodilityTree t4 = new CodilityTree(2);
        CodilityTree t5 = new CodilityTree(1);
        CodilityTree.connect(t1, null, t2);
        CodilityTree.connect(t2, null, t3);
        CodilityTree.connect(t3, null, t4);
        CodilityTree.connect(t4, null, t5);
        CodilityTree root = t1;
        return root;
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    // length; search tree; balanced
    //    3        false     false
    public static CodilityTree getTree8() {
        CodilityTree n1 = new CodilityTree(1);
        CodilityTree n2 = new CodilityTree(2);
        CodilityTree n3 = new CodilityTree(3);
        CodilityTree.connect(n1, null, n2);
        CodilityTree.connect(n2, n3, null);
        CodilityTree root = n1;
        return root;
    }

    //       1
    //     /   \
    //    2     3
    //   / \   / \
    //  4  5  6   7
    public static CodilityTree getTree9() {
        CodilityTree n1 = new CodilityTree(1);
        CodilityTree n2 = new CodilityTree(2);
        CodilityTree n3 = new CodilityTree(3);
        CodilityTree n4 = new CodilityTree(4);
        CodilityTree n5 = new CodilityTree(5);
        CodilityTree n6 = new CodilityTree(6);
        CodilityTree n7 = new CodilityTree(7);
        CodilityTree.connect(n1, n2, n3);
        CodilityTree.connect(n2, n4, n5);
        CodilityTree.connect(n3, n6, n7);
        CodilityTree root = n1;
        return root;
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    // length; search tree; balanced
    //    4        false      false
    public static CodilityTree getTree10() {
        CodilityTree t1 = new CodilityTree(5);
        CodilityTree t2 = new CodilityTree(4);
        CodilityTree t3 = new CodilityTree(8);
        CodilityTree t5 = new CodilityTree(13);
        CodilityTree t6 = new CodilityTree(4);
        CodilityTree t9 = new CodilityTree(5);
        CodilityTree t10 = new CodilityTree(1);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, null, null);
        CodilityTree.connect(t3, t5, t6);
        CodilityTree.connect(t6, t9, t10);
        CodilityTree root = t1;
        return root;
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
    // length; search tree; balanced
    //    5        true       false
    public static CodilityTree getTree11() {
        CodilityTree t1 = new CodilityTree(8);
        CodilityTree t2 = new CodilityTree(6);
        CodilityTree t3 = new CodilityTree(18);
        CodilityTree t4 = new CodilityTree(3);
        CodilityTree t5 = new CodilityTree(7);
        CodilityTree t6 = new CodilityTree(10);
        CodilityTree t7 = new CodilityTree(20);
        CodilityTree t8 = new CodilityTree(5);
        CodilityTree t9 = new CodilityTree(4);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, t4, t5);
        CodilityTree.connect(t3, t6, t7);
        CodilityTree.connect(t4, null, t8);
        CodilityTree.connect(t8, t9, null);
        return t1;
    }

    //           8
    //        /
    //       6
    //    /     \
    //   3       7
    //  / \       \
    // 2   4      10
    // length; search tree; balanced
    //    4        no         false
    public static CodilityTree getTree12() {
        CodilityTree t1 = new CodilityTree(8);
        CodilityTree t2 = new CodilityTree(6);
        CodilityTree t4 = new CodilityTree(3);
        CodilityTree t5 = new CodilityTree(7);
        CodilityTree t6 = new CodilityTree(2);
        CodilityTree t7 = new CodilityTree(4);
        CodilityTree t8 = new CodilityTree(10);
        CodilityTree.connect(t1, t2, null);
        CodilityTree.connect(t2, t4, t5);
        CodilityTree.connect(t4, t6, t7);
        CodilityTree.connect(t5, null, t8);
        return t1;
    }

    //      8
    //        \
    //         6
    //      /     \
    //     3       7
    //    / \       \
    //   2   4      10
    // length; search tree; balanced
    //    4        no         false
    public static CodilityTree getTree13() {
        CodilityTree t1 = new CodilityTree(8);
        CodilityTree t2 = new CodilityTree(6);
        CodilityTree t4 = new CodilityTree(3);
        CodilityTree t5 = new CodilityTree(7);
        CodilityTree t6 = new CodilityTree(2);
        CodilityTree t7 = new CodilityTree(4);
        CodilityTree t8 = new CodilityTree(10);
        CodilityTree.connect(t1, null, t2);
        CodilityTree.connect(t2, t4, t5);
        CodilityTree.connect(t4, t6, t7);
        CodilityTree.connect(t5, null, t8);
        return t1;
    }

    //          1
    //        /   \
    //       2     2
    //        \   /
    //         4 4
    public static CodilityTree getTree14() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(2);
        CodilityTree t3 = new CodilityTree(2);
        CodilityTree t4 = new CodilityTree(4);
        CodilityTree t5 = new CodilityTree(4);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, null, t4);
        CodilityTree.connect(t3, t5, null);
        return t1;
    }

    //        1
    //      /   \
    //     3     3
    //    /     /
    //   4     4
    public static CodilityTree getTree15() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(3);
        CodilityTree t3 = new CodilityTree(3);
        CodilityTree t4 = new CodilityTree(4);
        CodilityTree t5 = new CodilityTree(4);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, t4, null);
        CodilityTree.connect(t3, t5, null);
        CodilityTree root = t1;
        return root;
    }

    //          1
    //        /   \
    //       2     2
    //      / \   / \
    //     8   4 4   8
    public static CodilityTree getTree16() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(2);
        CodilityTree t3 = new CodilityTree(2);
        CodilityTree t4 = new CodilityTree(4);
        CodilityTree t5 = new CodilityTree(4);
        CodilityTree t6 = new CodilityTree(8);
        CodilityTree t7 = new CodilityTree(8);
        CodilityTree.connect(t1, t2, t3);
        CodilityTree.connect(t2, t6, t4);
        CodilityTree.connect(t3, t5, t7);
        return t1;
    }


    //          1
    //            \
    //             2
    //            / \
    //           1   1
    //              /
    //             4
    public static CodilityTree getTree17() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(2);
        CodilityTree t3 = new CodilityTree(1);
        CodilityTree t4 = new CodilityTree(1);
        CodilityTree t5 = new CodilityTree(4);
        CodilityTree.connect(t1, t2, null);
        CodilityTree.connect(t2, t3, t4);
        CodilityTree.connect(t4, t5, null);
        CodilityTree root = t1;
        return root;
    }

    //          1
    //            \
    //             1

    public static CodilityTree getTree18() {
        CodilityTree t1 = new CodilityTree(1);
        CodilityTree t2 = new CodilityTree(1);
        CodilityTree.connect(t1, null, t2);
        CodilityTree root = t1;
        return root;
    }

    private boolean isTreeSame(CodilityTree p, CodilityTree q) {
        if (p == null && q == null) {
            // base case: 1) root is null 2) reaching leaf's child
            return true;
        }
        if (p != null && q != null) {
            return (p.x == q.x && // compare roots' values
                isTreeSame(p.l, q.l) && // compare left subtrees
                isTreeSame(p.r, q.r)); // compare right subtrees
        } else {
            // is only of root is null, return false
            return false;
        }
    }

}
