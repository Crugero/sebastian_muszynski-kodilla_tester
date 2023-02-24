package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private Calculator calculator;
    int a = 5;
    int b = 8;
    int c = 0;
    int d = -2;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPowerWithIntegers() { //może być w jednym czy powinno być rozbite na osobne przypadki?
        int powResultA = calculator.power(a);
        int powResultB = calculator.power(c);
        int powResultC = calculator.power(d);
        assertEquals(25, powResultA, 0.01);
        assertEquals(0, powResultB, 0.01);
        assertEquals(4, powResultC, 0.01);
    }
    // W treści zadania jest coś o delcie i porównaniu double, a wcześniej były polecenia do budowania Calculator na INT'ach, po co delta? :D
    // Odwrotnie są komendy przy instalacji JUNIT (podana dla Maca jest w rzeczywistości dla Windowsa) :D
}