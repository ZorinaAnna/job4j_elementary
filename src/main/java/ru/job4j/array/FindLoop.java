package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
    /* Для поиска индекса заданного элемента в массиве целых чисел */

        int result = -1; /* -1 будет возвращено, если элемент не найден в массиве.
        Использование -1 — стандартный способ обозначить "не найдено" */

        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) { /* Сравнение текущего элемента массива с искомым элементом */
                result = i;
                break;
            }
        }
        return result; /* Если элемент был найден, будет возвращен его индекс; если нет — вернется -1 */
    }
}