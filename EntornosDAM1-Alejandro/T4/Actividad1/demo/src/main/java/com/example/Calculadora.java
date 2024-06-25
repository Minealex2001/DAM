package com.example;

/**
 * Hello world!
 *
 */
public class Calculadora {
    int num1;
    int num2;
 
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
 
    public int resta() {
        int resul;
        if(resta2())
            resul = num1 - num2;
        else
            resul = num2 - num1;
        return resul;
    }
 
    public boolean resta2() {
        if (num1 >= num2)
            return true;
        else
            return false;
    }
 
    public Integer divide2() {
        if(num2 == 0) return null;
        int resul = num1 / num2;
        return resul;
    }
}


