package problems;

import com.structure.TreeNode;

public class _00104_MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return depthCounter(root, 1);
    }

    public int depthCounter(TreeNode root, int count) {
        int right = 1;
        int left = 1;

        if (root.left != null) {
            left += depthCounter(root.left, count);
        }
        if (root.right != null) {
            right += depthCounter(root.right, count);
        }
        return Math.max(left, right);
    }
}
