package org.iesalvarofalomir.calc;
import org.iesalvarofalomir.calc.oper.Operacion;
public class Calculadora{
public static void main(String[] args){
System.out.println("Vamos a multiplicar y sumar los numeros 10 y 100.");
int a = 10;
int b = 100;
int suma = Operacion.suma(a, b);
int multiplicacion = Operacion.mult(a, b);
System.out.println("La suma da "+suma);
System.out.println("La multiplicación da "+multiplicacion);
}
}
