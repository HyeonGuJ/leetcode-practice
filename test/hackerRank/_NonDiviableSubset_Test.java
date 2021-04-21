package hackerRank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class _NonDiviableSubset_Test {


    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test0() {

        List<Integer> list = Arrays.asList(19, 10, 12, 10, 24, 25, 22);
        int k = 4;
        int actuals = _NonDiviableSubset.nonDivisibleSubset(k, list);
        int expecteds = 3;
        assertEquals(expecteds, actuals);
    }
}
