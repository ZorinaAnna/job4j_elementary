package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        String result = Max.max(left, right);
        String expected = "Условие не выполняется";
        assertThat(result).isEqualTo(expected);
    }
}