package JUnit.T_1_AsserEquals_true.DC.scr.test;

import JUnit.T_1_AsserEquals_true.DC.scr.main.NumberUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    void isEvenTest() {
        assertTrue(NumberUtils.isEven(2));
        assertTrue(NumberUtils.isEven(0));
        assertFalse(NumberUtils.isEven(3));
        assertFalse(NumberUtils.isEven(1));
    }
    @Test
    void calculateFactorialTest() {
        assertEquals(1, NumberUtils.calculateFactorial(0));
        assertEquals(1, NumberUtils.calculateFactorial(1));
        assertEquals(2, NumberUtils.calculateFactorial(2));
        assertEquals(6, NumberUtils.calculateFactorial(3));
        assertEquals(24, NumberUtils.calculateFactorial(4));
    }
    @Test
    public void calculateFactorialNegativeTest() {
        assertEquals(-1, NumberUtils.calculateFactorial(-1));
        assertEquals(-1, NumberUtils.calculateFactorial(-5));
    }

    @Test
    public void CalculateFactorialTooBigTest() {
        assertEquals(-2, NumberUtils.calculateFactorial(13));
        assertEquals(-2, NumberUtils.calculateFactorial(14));
    }
}
