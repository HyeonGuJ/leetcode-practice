package leetcode.problems;

public class _00000_allin {


    public int solution(int money, int countOfAllin) {

        int count = 0;

        while (money > 1) {
            if (countOfAllin > 0 && money % 2 == 0) {
                money /= 2;
                countOfAllin--;
            } else {
                money--;
            }
            count++;
        }
        return count;

    }

}
