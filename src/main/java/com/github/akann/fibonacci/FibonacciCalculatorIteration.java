package com.github.akann.fibonacci;

/**
 * Interation version
 *
 * @author akan
 */
class FibonacciCalculatorIteration implements FibonacciCalculator {


    public int calculate(int number) {

        if ( number < 3) {
            return 1;
        }

        int fib           = 1;
        int fib_prev      = 1;
        int fib_prev_prev = 1;

        for (int i=3; i<=number; i++) {
            fib = fib_prev + fib_prev_prev;

            fib_prev_prev = fib_prev;
            fib_prev      = fib;
        }

        return fib;
    }
}
