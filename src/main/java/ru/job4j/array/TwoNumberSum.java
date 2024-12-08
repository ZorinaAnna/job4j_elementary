package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
    /* Для поиска индекса двух элементов в отсортированном массиве, сумма которых равна заданному значению target */

        int i = 0; /* Указатель на начало массива */
        int j = array.length - 1; /* Указатель на конец массива */

        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[]{i, j}; /* Возвращаем индексы, если сумма равна target */
            } else if (sum < target) {
                i++; /* Увеличиваем левый указатель, чтобы увеличить сумму */
            } else {
                j--; /* Уменьшаем правый указатель, чтобы уменьшить сумму */
            }
        }

        return new int[0]; /* Возвращаем пустой массив, если пара не найдена */
    }
}