package com.github.akann.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Cache version to improve performance
 *
 * @author akan
 */
class FibonacciCalculatorCache implements FibonacciCalculator {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    public int calculate(int number) {
        if (cache.containsKey(number)) {
            return cache.get(number);
        }

        if ( number < 3 ) {
            return 1;
        }

        int fib1 = calculate(number - 1);
        int fib2 = calculate(number - 2);

        cache.put(number, fib1 + fib2);

        return fib1 + fib2;

    }
}
