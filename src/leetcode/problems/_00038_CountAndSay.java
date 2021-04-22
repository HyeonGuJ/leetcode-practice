package leetcode.problems;

public class _00038_CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }

        String answer = "11";
        for (int i = 3; i < n+1; i++) {
            answer = getNext(answer);
        }
        return answer;
    }

    public String getNext(String n) {
        int count = 1;

        String before = n.charAt(0) + "";
        String total = "";
        for (int i = 1; i < n.length(); i++) {

            if (!before.equals(n.charAt(i) + "")) {
                total += count + "" + before;
                count = 1;
            } else {
                count++;
            }
            before = n.charAt(i) + "";
        }
        total += count + "" + before;

        return total;
    }
}
