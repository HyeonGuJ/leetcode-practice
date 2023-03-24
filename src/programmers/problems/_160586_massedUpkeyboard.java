package programmers.problems;

public class _160586_massedUpkeyboard {


    public int[] solution(String[] keymap, String[] targets) {

        int[] ints = calculateIndex(keymap);
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String str = targets[i];
            int value = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ints[str.charAt(j) - 'A'] == 0) {
                    return new int[]{-1};
                }
                value += ints[str.charAt(j) - 'A'];
            }
            answer[i] = value;
        }
        return answer;
    }

    int[] calculateIndex(String[] keymap) {
        int[] indexed = new int[26];

        for (int i = 0; i < keymap.length; i++) {
            String str = keymap[i];
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j) - 'A';
                System.out.print("c : " + c + " / ");
                if (indexed[c] != 0) {
                    indexed[c] = Math.min(indexed[c], j + 1);
                } else {
                    indexed[c] = j + 1;
                }
            }
        }
        return indexed;
    }

    //test for solution in new file
    public static void main(String[] args) {
        _160586_massedUpkeyboard test = new _160586_massedUpkeyboard();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        int[] answer = test.solution(keymap, targets);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}
