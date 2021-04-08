package leetcode.problems;

/*
Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
*/
// 1: I
// 2: II
// 3: III
// 4: IV
// 5: V

public class _00012_IntegertoRoman {


    public String intToRoman(int num) {
        if (num < 1 && num > 3999) {
            throw new RuntimeException("허용되지 않은 숫자");
        }
        String[] one = {"I", "V", "X"};
        String[] two = {"X", "L", "C"};
        String[] three = {"C", "D", "M"};
        String[] four = {"M"};

        String[][] romes = {one, two, three, four};
        String result = "";
        int count = 0;

        while (num > 0) {
            result = matchRome(num % 10, romes[count]) + result;
            num /= 10;
            count++;
        }
        return result;
    }

    private String matchRome(int num, String[] rome) {
        if (1 <= num && num <= 3) {
            String temp = "";
            for (int i = 0; i < num; i++) {
                temp += rome[0];
            }
            return temp;
        } else if (num == 4) {
            return rome[0] + rome[1];
        } else if (num == 5) {
            return rome[1];
        }
        if (6 <= num && num <= 8) {
            String temp = rome[1];
            for (int i = 0; i < num - 5; i++) {
                temp += rome[0];
            }
            return temp;
        } else if (num == 9) {
            return rome[0] + rome[2];
        } else {
            return "";
        }
    }
}
