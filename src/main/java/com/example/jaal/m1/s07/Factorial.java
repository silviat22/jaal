/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.m1.s07;

/**
 * Basic recursive and iterative implementations of the factorial function
 * <p>
 * TODO: robustness
 */
public class Factorial {
    /**
     * Recursive factorial
     * 
     * @param n A natural number
     * @return the factorial of n
     */
    public static long recursive(int n) {
        if (n < 2) {
            return 1;
        }

        return n * recursive(n - 1);
    }

    /**
     * Iterative factorial
     * 
     * @param n A natural number
     * @return the factorial of n
     */
    public static long iterative(int n) {
        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Smoke test for factorial calculation
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int n = 20;
        System.out.printf("Factorial of %d (recursive) is %d%n", n, recursive(n));
        System.out.printf("Factorial of %d (iterative) is %d%n", n, iterative(n));
    }
}
