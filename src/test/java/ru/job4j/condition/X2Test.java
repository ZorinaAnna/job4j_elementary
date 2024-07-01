package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA1B1C1X1Then0() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Then0() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Then0() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 3;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}
