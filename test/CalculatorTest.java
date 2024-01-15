import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void testMultiply2() {
        assertEquals(20, cal.multiply(4, 5));
    }

    @Test
    void testMultiply3() {
        assertEquals(60, cal.multiply(4, 5, 3));
    }
}