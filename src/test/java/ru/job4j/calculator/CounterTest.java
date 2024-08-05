package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    @Test
    public void whenSumFromZeroToTenThenFiftyFive() {
        int result = Counter.sum(0, 10);
        assertEquals(55, result);
    }

    @Test
    public void whenSumFromThreeToEightThenThirtyThree() {
        int result = Counter.sum(3, 8);
        assertEquals(33, result);
    }

    @Test
    public void whenSumFromOneToOneThenOne() {
        int result = Counter.sum(1, 1);
        assertEquals(1, result);
    }

    @Test
    public void whenSumByEvenFromZeroToTenThenThirty() {
        int result = Counter.sumByEven(0, 10);
        assertEquals(30, result);
    }

    @Test
    public void whenSumByEvenFromThreeToEightThenEighteen() {
        int result = Counter.sumByEven(3, 8);
        assertEquals(18, result);
    }

    @Test
    public void whenSumByEvenFromOneToOneThenZero() {
        int result = Counter.sumByEven(1, 1);
        assertEquals(0, result);
    }
}