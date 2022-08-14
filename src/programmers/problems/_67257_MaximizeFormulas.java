package programmers.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/67257
public class _67257_MaximizeFormulas {

    public long solution(String expression) {

        List<Long> numbers = getNumbers(expression);
        List<String> ops = getOps(expression);

        long a = calcSeq(new ArrayList<>(numbers), new ArrayList<>(ops), "+", "-", "*");
        long b = calcSeq(new ArrayList<>(numbers), new ArrayList<>(ops), "+", "*", "-");
        long c = calcSeq(new ArrayList<>(numbers), new ArrayList<>(ops), "-", "+", "*");
        long d = calcSeq(new ArrayList<>(numbers), new ArrayList<>(ops), "-", "*", "+");
        long e = calcSeq(new ArrayList<>(numbers), new ArrayList<>(ops), "*", "-", "+");
        long f = calcSeq(new ArrayList<>(numbers), new ArrayList<>(ops), "*", "+", "-");

        return Collections.max(List.of(a, b, c, e, d, f));

    }

    //op1->op2->op3순서로 계산.
    long calcSeq(List<Long> numbers, List<String> ops, String op1, String op2, String op3) {

        List<String> seq = List.of(op1, op2, op3);
        seq.forEach(e -> {
            if ("+".equals(e)) {
                calcPlus(numbers, ops);
            } else if ("-".equals(e)) {
                calcMinus(numbers, ops);
            } else if ("*".equals(e)) {
                calcMul(numbers, ops);
            }
        });

        System.out.println("numbers.size() = : " + numbers.size());
        System.out.println("ops.size() = : " + ops.size());
        System.out.println("answer = : " + Math.abs(numbers.get(0)));


        return Math.abs(numbers.get(0));
    }


    void calcPlus(List<Long> numbers, List<String> ops) {
        if (ops.contains("+")) {
            int i = ops.indexOf("+");
            long newOne = numbers.get(i) + numbers.get(i + 1);

            numbers.remove(i);
            numbers.remove(i);
            numbers.add(i, newOne);
            ops.remove(i);

            calcPlus(numbers, ops);
        } else {
            return;
        }
    }

    void calcMinus(List<Long> numbers, List<String> ops) {
        if (ops.contains("-")) {
            int i = ops.indexOf("-");
            long newOne = numbers.get(i) - numbers.get(i + 1);

            numbers.remove(i);
            numbers.remove(i);
            numbers.add(i, newOne);
            ops.remove(i);

            calcMinus(numbers, ops);
        } else {
            return;
        }
    }

    void calcMul(List<Long> numbers, List<String> ops) {
        if (ops.contains("*")) {
            int i = ops.indexOf("*");
            long newOne = numbers.get(i) * numbers.get(i + 1);

            numbers.remove(i);
            numbers.remove(i);
            numbers.add(i, newOne);
            ops.remove(i);

            calcMul(numbers, ops);
        } else {
            return;
        }
    }


    List<Long> getNumbers(String originalString) {
        return Arrays.asList(originalString.split("[*,+,-]")).stream()
                .map(e -> Long.parseLong(e))
                .collect(Collectors.toList());
    }

    List<String> getOps(String originalString) {
        ArrayList<String> ops = new ArrayList<>();
        for (int i = 0; i < originalString.length(); i++) {
            char c = originalString.charAt(i);
            if (c == '*') {
                ops.add("*");
            } else if (c == '+') {
                ops.add("+");
            } else if (c == '-') {
                ops.add("-");
            }
        }
        return ops;
    }
}
