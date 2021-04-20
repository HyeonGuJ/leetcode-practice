package leetcode.problems;

import java.util.List;

//https://leetcode.com/problems/triangle/
public class _00130_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        int[][] array = new int[triangle.size()][];

        for (int i = 0; i < triangle.size(); i++) {
            array[i] = triangle.get(i).stream().mapToInt(e -> e).toArray();
        }

        int value = 10000;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(i+" "+ j+" : ");

                int num = array[i][j];

                Integer left = null;
                Integer right = null;

                if (i > 0) {

                    if (j > 0) {
                        left = array[i - 1][j - 1];
                    }

                    if (array[i-1].length > j) {
                        right = array[i - 1][j];
                    }
                }

                int temp = 10000;
                if (left == null && right == null) {
                    temp = num;
                } else if (left != null && right == null) {
                    temp = left + num;
                } else if (left == null && right != null) {
                    temp = right + num;
                } else {
                    temp = Math.min(left, right) + num;
                }

                System.out.print(temp + " ");
                array[i][j] = temp;

                //last
                if (i == triangle.size() - 1) {
                    value = Math.min(temp, value);
                }

                System.out.println();
            }
        }

        return value;
    }
}
