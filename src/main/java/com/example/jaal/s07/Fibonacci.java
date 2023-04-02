/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.s07;

/**
 * Basic recursive and iterative implementations of the Fibonacci function
 * <p>
 * TODO: robustness
 */
public class Fibonacci {
    /**
     * Recursive Fibonacci
     * 
     * @param n A natural number
     * @return the Fibonacci of n
     */
    public static long recursive(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return recursive(n - 1) + recursive(n - 2);
    }

    /**
     * Iterative Fibonacci
     * 
     * @param n A natural number
     * @return the Fibonacci of n
     */
    public static long iterative(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long previous = 1;
        long result = 1;

        for (int i = 3; i <= n; i++) {
            long current = result;
            result += previous;
            previous = current;
        }

        return result;
    }

    /**
     * Smoke test for Fibonacci calculation
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int n = 40;
        System.out.printf("Fibonacci of %d (recursive) is %d%n", n, recursive(n));
        System.out.printf("Fibonacci of %d (iterative) is %d%n", n, iterative(n));
    }
}
