package hackerRank;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _OrganizingContainersofBalls_Test {


    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test0() {
        int[][] input =
            {
                {1, 1},
                {1, 1}
            };

        String actuals = _OrganizingContainersofBalls.organizingContainers(input);
        String expecteds = "Possible";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[][] input =
            {
                {0, 2},
                {1, 1}
            };

        String actuals = _OrganizingContainersofBalls.organizingContainers(input);
        String expecteds = "Impossible";
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[][] input =
            {
                {1, 3, 1},
                {2, 1, 2},
                {3, 3, 3}
            };

        String actuals = _OrganizingContainersofBalls.organizingContainers(input);
        String expecteds = "Impossible";
        assertEquals(expecteds, actuals);
    }


    @Test
    public void Test3() {
        int[][] input =
            {
                {0, 2, 1},
                {1, 1, 1},
                {2, 0, 0}
            };

        String actuals = _OrganizingContainersofBalls.organizingContainers(input);
        String expecteds = "Possible";
        assertEquals(expecteds, actuals);
    }
}
