package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPowerWithIntegers() { //może być w jednym czy powinno być rozbite na osobne przypadki?
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;
        int c = -2;
        int powResultA = calculator.power(a);
        int powResultB = calculator.power(b);
        int powResultC = calculator.power(c);
        assertEquals(25, powResultA, 0.01);
        assertEquals(0, powResultB, 0.01);
        assertEquals(4, powResultC, 0.01);
    }
    // W treści zadania jest coś o delcie i porównaniu double, a wcześniej były polecenia do budowania Calculator na INT'ach, po co delta? :D
    // Odwrotnie są komendy przy instalacji JUNIT (podana dla Maca jest w rzeczywistości dla Windowsa) :D
}