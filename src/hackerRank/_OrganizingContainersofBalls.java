package hackerRank;

import utils.Printer;

public class _OrganizingContainersofBalls {


    public static String organizingContainers(int[][] n) {

        int length = n[0].length;

        int[] count = new int[length];
        int[] after = new int[length];


        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                } else {
                    int value = n[i][j];
                    n[j][j] += value;
                    n[i][j] = 0;

                    count[j]+=value;
                    count[i]-=value;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                after[i] += n[i][j];
            }
        }
        Printer.print(count);

        for (int i = 0; i < length; i++) {
            if(count[i] <0){
                return "Impossible";
            }
        }

        return "Possible";
    }

}
