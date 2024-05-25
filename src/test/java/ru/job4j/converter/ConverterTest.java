package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void rubleToEuro() {
    }

    @Test
    void rubleToDollar() {
    }

    @Test
    void EuroToDollar() {
    }

    @Test
    void DollarToEuro() {
    }

    float input = 140;
    float expected = 1.6279069F;
    float output = RubleToEuro(input);
    assertThat(output).isEqualTo(expected, withPrecision(value));
    }
    @Test
    void whenConvert200RblThen3dot3333Euro() {
    }
}