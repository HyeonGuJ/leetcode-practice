package hackerRank;

public class _SimpleArraySum {


    public static int simpleArraySum(int[] n) {
        int output = 0;
        for (int i = 0; i < n.length; i++) {
            output += n[i];
        }
        return output;
    }

}
