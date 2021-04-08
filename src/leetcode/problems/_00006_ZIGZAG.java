package leetcode.problems;

public class _00006_ZIGZAG {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int stepSize = (2 * numRows - 2);
        int widthOfStep = numRows - 1;
        int sizeOfArr = (s.length() / stepSize + 1) * widthOfStep;

        String[][] arr = new String[numRows][sizeOfArr];

        int x = 0;
        int y = 0;
        int count = 0;
        while (count < s.length()) {
            arr[x][y] = s.charAt(count) + "";

            int indexOfStep = count % stepSize;
            if (indexOfStep < numRows - 1) {
                x++;
            } else {
                x--;
                y++;
            }
            count++;
        }

        //Printer.print(arr);
        //merge
        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < sizeOfArr; j++) {
                if (arr[i][j] != null) {
                    result = result + arr[i][j];
                }
            }
        }
        return result;
    }


    public String convert2(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        return null;
    }
}
