package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
    /* Для поиска индекса заданного элемента в массиве целых чисел */

        int result = -1;  /* Использование -1 — не найдено */
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) { /* Сравнение текущего элемента массива с искомым элементом */
                result = i; /* Если текущий элемент равен искомому элементу, то result присваивается текущее значение i */
                break; /* И цикл прерывается */
            }
        }
        return result; /* После завершения цикла метод возвращает значение переменной result.
        Если элемент был найден, будет возвращен его индекс, если нет — вернется -1 */
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
    /* Для поиска индекса заданного элемента в массиве целых чисел в указанном диапазоне */
        int result = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}