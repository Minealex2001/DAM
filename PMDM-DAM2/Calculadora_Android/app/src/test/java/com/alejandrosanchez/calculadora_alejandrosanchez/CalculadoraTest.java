package com.alejandrosanchez.calculadora_alejandrosanchez;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();
    ArrayList<String> arrayCalculo = new ArrayList<String>();


    @BeforeEach
    public void setUp() {
        arrayCalculo.clear();
    }
    @Test
    public void testSuma(){
        arrayCalculo.addAll(Arrays.asList("5", "+", "3"));
        calculadora.hacerOperacion(arrayCalculo);
        assertEquals("8", arrayCalculo.get(0));
    }

    @Test
    public void testAdd1Operand(){
        arrayCalculo.addAll(Arrays.asList("4", "+", "3", "+", "1"));
        calculadora.hacerOperacion(arrayCalculo);
        assertEquals("8", arrayCalculo.get(0));
    }

    @Test
    public void testMultiplicacion(){
        arrayCalculo.addAll(Arrays.asList("4", "*", "2"));
        calculadora.hacerOperacion(arrayCalculo);
        assertEquals("8", arrayCalculo.get(0));
    }

}
