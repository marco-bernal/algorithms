package com.mab.algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void shouldReturnFibonacciSumForAGivenNumber() {
        //given
        int number = 9;

        //when
        int result = fibonacci.getFibonacci(number);

        //then
        assertThat(result).isEqualTo(34);
    }

}
