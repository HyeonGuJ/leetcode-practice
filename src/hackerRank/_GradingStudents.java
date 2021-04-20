package hackerRank;

import java.util.List;
import java.util.stream.Collectors;

public class _GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        return grades.stream().map(e -> {
            if (e < 38) {
                return e;
            } else if (e % 5 == 4 || e % 5 == 3) {
                return e - e % 5 + 5;
            } else {
                return e;
            }

        }).collect(Collectors.toList());

    }


}
