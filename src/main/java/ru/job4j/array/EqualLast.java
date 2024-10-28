package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
    /* Для проверки, равны ли последние элементы двух массивов целых чисел */

        if (left.length == 0 || right.length == 0) { /* Проверяется, являются ли один или оба массива пустыми */
            return false;
        }

        return left[left.length - 1] == right[right.length - 1];
    }
}