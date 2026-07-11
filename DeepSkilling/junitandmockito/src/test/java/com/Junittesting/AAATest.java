package com.Junittesting;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setup executed");
        calculator = new Calculator();
    }

    @Test
    public void testSubtraction() {

        
        int a = 30;
        int b = 20;

        
        int result = calculator.sub(a, b);

     
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction2() {

        
        int a = 50;
        int b = 25;

       
        int result = calculator.sub(a, b);

        
        assertEquals(25, result);
    }

    @After
    public void tearDown() {
        System.out.println("method executed");
        calculator = null;
    }
}