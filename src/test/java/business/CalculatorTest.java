package business;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    public void sumPopulatedIntegerList() {
        final Integer expected = 20;
        final Integer actual = calculator.sum(asList(10,10));

        assertEquals(expected, actual);
    }

    @Test
    public void sumEmptyIntegerList() {
        final Integer expected = 0;
        final Integer actual = calculator.sum(Collections.emptyList());

        assertEquals(expected, actual);
    }

    @Test
    public void sumNullIntegerList() {
        final Integer expected = 0;
        final Integer actual = calculator.sum(null);

        assertEquals(expected, actual);
    }

}
