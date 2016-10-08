package com.github.akann.fibonacci;

/**
 * Recursion version
 *
 * @author akan
 */
class FibonacciCalculatorRecursion implements FibonacciCalculator {

    public int calculate(int number) {

        if ( number < 3) return 1;

        return calculate(number - 1) + calculate(number - 2);

    }
}
