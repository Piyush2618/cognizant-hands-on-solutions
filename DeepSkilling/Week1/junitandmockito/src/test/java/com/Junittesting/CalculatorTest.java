package com.Junittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSubtraction() {

        Calculator calculator = new Calculator();

        int result = calculator.sub(5, 3);

        assertEquals(2, result);
    }
}