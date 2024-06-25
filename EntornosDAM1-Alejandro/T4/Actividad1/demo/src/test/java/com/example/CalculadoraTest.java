package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {
 
    @Test
    public void testResta() {
        Calculadora calc = new Calculadora(10, 5);
        int result = calc.resta();
        assertEquals(5, result);
 
        calc = new Calculadora(5, 10);
        result = calc.resta();
        assertEquals(-5, result);
    }
 
    @Test
    public void testResta2() {
        Calculadora calc = new Calculadora(10, 5);
        boolean result = calc.resta2();
        assertTrue(result);
 
        calc = new Calculadora(5, 10);
        result = calc.resta2();
        assertFalse(result);
    }
 
    @Test
    public void testDivide2() {
        Calculadora calc = new Calculadora(10, 5);
        Integer result = calc.divide2();
        assertNotNull(result);
        assertEquals(2, result.intValue());
 
        calc = new Calculadora(10, 0);
        result = calc.divide2();
        assertNull(result);
    }
}

