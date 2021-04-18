package leetcode.problems;

import java.util.HashSet;
import java.util.Set;
import leetcode.structure.CodilityTree;

public class _00000_longestDistinctPath {


    public int solution(CodilityTree tree) {

        Set<Integer> thisPath = new HashSet<>();
        return dfs(tree, thisPath);
    }

    public int dfs(CodilityTree tree, Set<Integer> thisPath) {
        if (thisPath.contains(tree.x)) {
            return 0;
        }

        int left = 0;
        if (tree.l != null) {

            Set<Integer> path = new HashSet<>();
            path.addAll(thisPath);
            path.add(tree.x);
            left = dfs(tree.l, path);
        }
        int right = 0;
        if (tree.r != null) {

            Set<Integer> path = new HashSet<>();
            path.addAll(thisPath);
            path.add(tree.x);
            right = dfs(tree.r, path);
        }
        return Math.max(left, right) + 1;

    }
}
