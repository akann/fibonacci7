package com.github.akann.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Java program to calculate and print Fibonacci number
 * Fibonacci number is sum of previous two Fibonacci numbers fn = fn-1 + fn-2
 * first 12 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 *
 * @author akan
 */
class Fibonacci {

    private final FibonacciCalculator calculator;

    Fibonacci(FibonacciCalculator calculator) {
        this.calculator = calculator;
    }

    List<Integer> getSeries(int limit) {
        List<Integer> series = new ArrayList<>();

        for (int i=1; i<=limit; i++) {
            series.add(calculator.calculate(i));
        }

        return series;
    }


}
