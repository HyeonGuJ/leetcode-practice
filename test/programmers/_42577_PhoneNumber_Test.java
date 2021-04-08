package programmers;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import programmers.problems._42577_PhoneNumber;

public class _42577_PhoneNumber_Test {


    _42577_PhoneNumber solution;

//    @Rule
//    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new _42577_PhoneNumber();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        String[] row = {"119", "97674223", "1195524421"};

        boolean actuals = solution.solution(row);
        boolean expecteds = false;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test1() {
        String[] row = {"123", "456", "789"};

        boolean actuals = solution.solution(row);
        boolean expecteds = true;
        assertEquals(expecteds, actuals);
    }

    @Test
    public void Test2() {
        String[] row = {"12", "123", "1235", "567", "88"};

        boolean actuals = solution.solution(row);
        boolean expecteds = false;
        assertEquals(expecteds, actuals);
    }


}
