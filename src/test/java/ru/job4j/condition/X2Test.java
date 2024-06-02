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
<<<<<<< HEAD
    void whenA0B1C1X1Then0() {
=======
    void whenA0B1C1X1Then2() {
>>>>>>> f600da4 (1.2. Входные данные в тесте [#297750])
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
<<<<<<< HEAD
        int expected = 3;
=======
        int expected = 2;
>>>>>>> f600da4 (1.2. Входные данные в тесте [#297750])
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
<<<<<<< HEAD
    void whenA1B1C0X1Then0() {
=======
    void whenA1B1C0X1Then2() {
>>>>>>> f600da4 (1.2. Входные данные в тесте [#297750])
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
<<<<<<< HEAD
        int expected = 3;
=======
        int expected = 2;
>>>>>>> f600da4 (1.2. Входные данные в тесте [#297750])
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
<<<<<<< HEAD
    void whenA1B1C1X0Then0() {
=======
    void whenA1B1C1X0Then1() {
>>>>>>> f600da4 (1.2. Входные данные в тесте [#297750])
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
<<<<<<< HEAD
        int expected = 3;
=======
        int expected = 1;
>>>>>>> f600da4 (1.2. Входные данные в тесте [#297750])
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}

