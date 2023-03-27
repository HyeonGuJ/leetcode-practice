package codility;

public class _binaryGap {

    public int solution(int N) {

        String binary = Integer.toBinaryString(N);
        int count =0 ; //연속된 0의 최대갯수
        int max = 0; //연속된 0의 최대갯수
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        _binaryGap main = new _binaryGap();
        System.out.println(main.solution(15));
    }


}
