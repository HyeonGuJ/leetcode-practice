package hackerRank;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import programmers.hackerRank._3DSurfaceArea;

public class _3DSurfaceArea_Test {


    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test0() {
        int[][] input =
            {
                {1, 3, 4},
                {2, 2, 3},
                {1, 2, 4}
            };

        int actuals = _3DSurfaceArea.surfaceArea(input);
        int expecteds = 60;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        int[][] input =
            {
                {1}
            };

        int actuals = _3DSurfaceArea.surfaceArea(input);
        int expecteds = 6;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int[][] input =
            {
                {2, 1}
            };

        int actuals = _3DSurfaceArea.surfaceArea(input);
        int expecteds = 14;
        assertEquals(expecteds, actuals);
    }

}
