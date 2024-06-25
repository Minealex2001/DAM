package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

  @Test
  public void testCalculoConNumeroPositivo() {
    int n = 5;
    int resultadoEsperado = 120;
    int resultadoObtenido = Factorial.calculo(n);
    assertEquals(resultadoEsperado, resultadoObtenido);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCalculoConNumeroNegativo() {
    int n = -5;
    Factorial.calculo(n);
  }

  @Test(expected = ArithmeticException.class)
  public void testCalculoConNumeroMuyGrande() {
    int n = Integer.MAX_VALUE;
    Factorial.calculo(n);
  }
}
