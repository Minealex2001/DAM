package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TablaEnterosTest {

  private static TablaEnteros tablaEnteros;
  private static Integer[] tablaPrueba = { 1, 2, 3, 4, 5 };

  @Before
  public static void inicializarTabla() {
    tablaEnteros = new TablaEnteros(tablaPrueba);
  }

  @Test
  public void testSumaTabla() {
    int sumaEsperada = 15;
    int sumaObtenida = tablaEnteros.sumaTabla();
    assertEquals(sumaEsperada, sumaObtenida);
  }

  @Test
  public void testMayorTabla() {
    int mayorEsperado = 5;
    int mayorObtenido = tablaEnteros.mayorTabla();
    assertEquals(mayorEsperado, mayorObtenido);
  }

  @Test
  public void testPosicionTabla() {
    int posicionEsperada = 2;
    int posicionObtenida = tablaEnteros.posicionTabla(3);
    assertEquals(posicionEsperada, posicionObtenida);
  }

  @Test
  public void testExcepcionIllegalArgumentException() {
    Integer[] tablaNula = null;
    assertThrows(
      IllegalArgumentException.class,
      () -> new TablaEnteros(tablaNula)
    );

    Integer[] tablaVacia = {};
    assertThrows(
      IllegalArgumentException.class,
      () -> new TablaEnteros(tablaVacia)
    );
  }

  @Test
  public void testExcepcionNoSuchElementException() {
    int elementoNoExistente = 10;
    assertThrows(
      java.util.NoSuchElementException.class,
      () -> tablaEnteros.posicionTabla(elementoNoExistente)
    );
  }
}
