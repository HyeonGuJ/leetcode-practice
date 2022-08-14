package programmers.problems;

//https://school.programmers.co.kr/learn/courses/30/lessons/62048
public class _62048_PlainSquare {

    public long solution(long w, long h) {
        return w * h - (w + h - getGCD(w, h));
        //return w * h - (w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue());
    }

    private long getGCD(long w, long h) {

        long small, big;

        big = w >= h ? w : h;
        small = w < h ? w : h;

        while (small != 0) {
            long nmg = big % small;
            big = small;
            small = nmg;
        }
        return big;
    }
}
