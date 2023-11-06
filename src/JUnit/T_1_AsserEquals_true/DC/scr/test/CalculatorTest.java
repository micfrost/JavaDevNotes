package JUnit.T_1_AsserEquals_true.DC.scr.test;

import JUnit.T_1_AsserEquals_true.DC.scr.main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class CalculatorTest {

    @Test
    void addTest1() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void addTest2() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(2, 3) == 5);
    }

    @Test
    void subtractTest1() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(-3, calculator.subtract(2, 5));
    }

    @Test
    void subtractTest2() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.subtract(2, 3) == -1);
    }

    @Test
    void multiplyTest1() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 0));
        assertEquals(-10, calculator.multiply(2, -5));
    }

    @Test
    void multiplyTest2() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.multiply(2, 3) == 6);
    }

    @Test
    void divideTest1() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-2, calculator.divide(10, -5));
    }

    @Test
    void divideTest2() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.divide(4, 2) == 2);
    }


}
