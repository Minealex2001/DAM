package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestFactorial {
    @Test
    public void testFactorialCalculoCorrecto() {
        int resultadoEsperado = 120;
        int resultado = Factorial.calculo(5);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNumeroNegativo() {
        Factorial.calculo(-1);
        fail("Debería haber lanzado una IllegalArgumentException");
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialOverflow() {
        Factorial.calculo(13);
        fail("Debería haber lanzado una ArithmeticException");
    }
}

