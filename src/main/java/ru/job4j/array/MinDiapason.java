package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
    /* Поиск минимума в диапазоне */

        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) { /* Если текущий элемент меньше min */
                min = array[i]; /* Обновляем min */
            }
        }
        return min;
    }
}
