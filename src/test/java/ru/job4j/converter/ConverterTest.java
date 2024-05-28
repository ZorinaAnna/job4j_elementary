package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RubleThen1dot6279069Euro() {
        float input = 140;
        float expected = 1.6279069F;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert17DollarThen14dot450001Euro() {
        float input = 17;
        float expected = 14.450001F;
        float output = Converter.dollarToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert567RubleThen7dot714286Dollar() {
        float input = 567;
        float expected = 7.714286F;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert18EuroThen21dot06Dollar() {
        float input = 18;
        float expected = 21.06F;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}