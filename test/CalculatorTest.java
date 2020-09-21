import static org.junit.jupiter.api.Assertions.*;

import calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculatorTest {
    @Test
    @DisplayName("Testing add 0 + 0)")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0and0(){
        int first = 3;
        int second = 5;
        int expected = 8;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

}