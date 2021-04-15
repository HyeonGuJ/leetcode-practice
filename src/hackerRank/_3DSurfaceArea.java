package programmers.hackerRank;

public class _3DSurfaceArea {

    // Complete the extraLongFactorials function below.
    public static int surfaceArea(int[][] array) {

        int height = array.length;
        int width = array[0].length;

        //step1. 상판 하판은 0이아닌 숫자의 갯수이다.
        int area = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (array[i][j] != 0) {
                    area++;
                }
            }
        }

        area *= 2;

        //step2 옆면보다 큰만큼이 면적이다 -> 앞뒤좌우니까 *4

        int[][] newArray = new int[height + 2][width + 2];

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                if (i == 0 || j == 0 || i == height + 1 || j == width + 1) {
                    newArray[i][j] = 0;
                } else {
                    newArray[i][j] = array[i - 1][j - 1];
                }
            }
        }
        //Printer.print(newArray);

        for (int i = 1; i < height + 1; i++) {
            for (int j = 1; j < width + 1; j++) {

                area += Math.max(0, newArray[i][j] - newArray[i - 1][j]);
                area += Math.max(0, newArray[i][j] - newArray[i + 1][j]);
                area += Math.max(0, newArray[i][j] - newArray[i][j - 1]);
                area += Math.max(0, newArray[i][j] - newArray[i][j + 1]);
            }
        }
        System.out.println(area);

        return area;
    }

}
