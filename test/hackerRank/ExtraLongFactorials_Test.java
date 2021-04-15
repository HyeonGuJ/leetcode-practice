package hackerRank;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ExtraLongFactorials_Test {


    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Test
    public void Test0() {
        int input = 25;

        BigDecimal actuals = ExtraLongFactorials.extraLongFactorials(input);
        BigDecimal expecteds = new BigDecimal("15511210043330985984000000");
        assertEquals(expecteds, actuals);
    }


    @Test
    public void Test1() {
        int input = 1;

        BigDecimal actuals = ExtraLongFactorials.extraLongFactorials(input);
        BigDecimal expecteds = new BigDecimal("1");
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        int input = 2;

        BigDecimal actuals = ExtraLongFactorials.extraLongFactorials(input);
        BigDecimal expecteds = new BigDecimal("2");
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test3() {
        int input = 3;

        BigDecimal actuals = ExtraLongFactorials.extraLongFactorials(input);
        BigDecimal expecteds = new BigDecimal("6");
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test4() {
        int input = 4;

        BigDecimal actuals = ExtraLongFactorials.extraLongFactorials(input);
        BigDecimal expecteds = new BigDecimal("24");
        assertEquals(expecteds, actuals);
    }
}
