package leetcode.problems;

public class _00070_ClimbingStairs {

    //같은 연산을 반복하지 않기위해 저장한다.
    int[] save = new int[50];

    public int climbStairs(int n) {
        if (save[n] != 0) {
            //저장해놓은것이 있다면 꺼내쓴다.
            return save[n];
        }


        //base case
        if (n == 1) {
            save[n] = 1;
            return 1;
        }
        if (n == 2) {
            save[n] = 2;
            return 2;
        }

        //recursive
        if (n >= 3) {
            int result = climbStairs(n - 1) + climbStairs(n - 2);
            save[n] = result;
            return result;
        }
        return 0;
    }
}
