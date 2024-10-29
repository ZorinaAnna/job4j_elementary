package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        /* Для сортировки выборкой */

        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); /* Поиск минимального элемента в оставшейся части массива */
            int index = FindLoop.indexInRange(data, min, i, data.length - 1); /* Поиск инекса этого минимального элемента */

            /* Переставляем текущий элемент с найденным минимальным */
            if (index != -1) { /* Проверяем, найден ли индекс */
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}