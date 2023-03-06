package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java. util.Collections;
public class RandomNumbers {

    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> numbers = new ArrayList<>();
        drawNumbers(rand, numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        giveMin(numbers);
        giveMax(numbers);
    }

    public static void drawNumbers(Random rand, List<Integer> numbers) {
        int sum = 0;
        while (sum < 5000) {
            int number = rand.nextInt(31);
            sum += number;
            numbers.add(number);
        }
    }

    public static int giveMin (List<Integer> numbers) {
        int result = numbers.get(0);
        System.out.println("Wartość MIN to: " + result);
        return result;
    }

    public static int giveMax (List<Integer> numbers) {
        int result = numbers.get(numbers.size() - 1);
        System.out.println("Wartość MAX to: " + result);
        return result;
    }
}