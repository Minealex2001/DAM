package com.example;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
import org.junit.Test;

public class TestFecha {

  @Test
  public void testDevuelveFechaTipo1() {
    Fecha fecha = new Fecha();
    String resultadoEsperado = "yyyy/MM";
    String resultado = fecha.DevuelveFecha(1);
    assertEquals(resultadoEsperado, resultado);
  }

  @Test
  public void testDevuelveFechaTipo2() {
    Fecha fecha = new Fecha();
    String resultadoEsperado = "MM/yyyy";
    String resultado = fecha.DevuelveFecha(2);
    assertEquals(resultadoEsperado, resultado);
  }

  @Test
  public void testDevuelveFechaTipo3() {
    Fecha fecha = new Fecha();
    String resultadoEsperado = "MM/yy";
    String resultado = fecha.DevuelveFecha(3);
    assertEquals(resultadoEsperado, resultado);
  }

  @Test
  public void testDevuelveFechaTipoInvalido() {
    Fecha fecha = new Fecha();
    String resultadoEsperado = "ERROR";
    String resultado = fecha.DevuelveFecha(4);
    assertEquals(resultadoEsperado, resultado);
  }
}
