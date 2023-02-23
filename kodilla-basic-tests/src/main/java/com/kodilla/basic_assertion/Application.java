package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.subtract(a, b);
        boolean subCorrect = ResultChecker.assertEquals(-3, subResult);
        if (subCorrect) {
            System.out.println("Wynik to: " + subResult + ". " + "Metoda subtract działa poprawnie przy odjęciu liczby " + b + " od " + a);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie przy odjęciu liczby " + b + " od " + a);
        }

        int powerResult = calculator.power(a);
        boolean powerCorrect= ResultChecker.assertEquals(25, powerResult);
        if (powerCorrect) {
            System.out.println("Wynik to: " + powerResult + ". " + "Metoda power działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby " +a);
        }
    }
}