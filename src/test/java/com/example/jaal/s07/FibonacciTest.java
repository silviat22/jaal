/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.s07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {
    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void recursivePlain(int input, long expected) {
        assertThat(Fibonacci.recursive(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void recursiveNegative() {
        assertThat(Fibonacci.recursive(-1024)).isEqualTo(0L);
    }

    /**
     * TODO: probably unacceptable performance for "large" input
     * <p>
     * Use a different approach
     */
    @Test
    void recursiveLarge() {
        assertThat(Fibonacci.recursive(42)).isEqualTo(267914296L);
    }

    @ParameterizedTest
    @CsvSource({ "0, 0", "1,1", "10, 55", "40, 102334155" })
    void iterativePlain(int input, long expected) {
        assertThat(Fibonacci.iterative(input)).isEqualTo(expected);
    }

    /**
     * TODO: discuss with the user the expected behavior for negative input
     */
    @Test
    void iterativeNegative() {
        assertThat(Fibonacci.iterative(-1024)).isEqualTo(0L);
    }

    /**
     * TODO: discuss with the user the expected behavior for "large" input
     */
    @Test
    void iterativeOverflow() {
        assertThat(Fibonacci.iterative(93)).isNegative();
    }
}
