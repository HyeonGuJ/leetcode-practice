package programmers.hackerRank;

import java.math.BigDecimal;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    public static BigDecimal extraLongFactorials(int n) {
        BigDecimal output = new BigDecimal(1);

        for (int i = 1; i < n + 1; i++) {
            output = output.multiply(new BigDecimal(i));
            //System.out.println(i + " : " + output);

        }
        System.out.println(output);

        return output;
    }

}
