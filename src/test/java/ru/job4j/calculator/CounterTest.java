package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToHundredThenTwoThousandFiveHundredAndThirty() {
        int start = 10;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2530;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToOneThenMinusThirty() {
        int start = -10;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = -30;
        assertThat(result).isEqualTo(expected);
    }
}