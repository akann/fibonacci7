package com.github.akann.fibonacci;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Java program to calculate and print Fibonacci number
 * Fibonacci number is sum of previous two Fibonacci numbers fn = fn-1 + fn-2
 * first 12 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 *
 * @author akan
 */
public class FibonacciDemo {

    public static void main(String[] args) {

        int limit = 45;

        if (args.length > 0 ) {
            limit = Integer.valueOf(args[0]);
        }

        Fibonacci     interationFib = new Fibonacci(new FibonacciCalculatorIteration());
        Fibonacci     recursionFib  = new Fibonacci(new FibonacciCalculatorRecursion());
        Fibonacci     cacheFib      = new Fibonacci(new FibonacciCalculatorCache());

        List<Integer> series;
        long          startTime;
        long          elapsed;
        int           max = limit > 12 ? 12 : limit;

        startTime = System.nanoTime();
        series    = cacheFib.getSeries(limit);
        elapsed   = System.nanoTime() - startTime;
        System.out.printf("Cache\t\t[%s]: %s...\n", formatTime(elapsed), series.subList(0,max));

        startTime = System.nanoTime();
        series    = interationFib.getSeries(limit);
        elapsed   = System.nanoTime() - startTime;
        System.out.printf("Interation\t[%s]: %s...\n", formatTime(elapsed), series.subList(0,max));

        startTime = System.nanoTime();
        series    = recursionFib.getSeries(limit);
        elapsed   = System.nanoTime() - startTime;
        System.out.printf("Recursion\t[%s]: %s...\n", formatTime(elapsed), series.subList(0,max));



    }

    private static String formatTime(long time) {
        return  String.format("%d min, %d sec",
                TimeUnit.NANOSECONDS.toHours(time),
                TimeUnit.NANOSECONDS.toSeconds(time) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(time)));

    }
}
