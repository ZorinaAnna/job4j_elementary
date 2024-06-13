package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class TrgAreaTest {

    @Test
    void whenP8K4Square8() {
        double expected = 8;
        int p = 8;
        double k = 4;
        double output = TrgArea.area(p, k, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP9K3Square6() {
        double expected = 6;
        int p = 9;
        double k = 3;
        double output = TrgArea.area(p, k, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K4Square8() {
        double expected = 8;
        int p = 10;
        double k = 4;
        double output = TrgArea.area(p, k, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}