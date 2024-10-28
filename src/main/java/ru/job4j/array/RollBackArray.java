package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
    /* Для создания нового массива, в котором элементы исходного массива располагаются в обратном порядке */

        int[] result = new int[array.length]; /* Массив для хранения элементов в обратном порядке */
        for (int index = 0; index < array.length; index++) { /* Переменная index отслеживает текущую позицию в цикле */
            result[index] = array[array.length - 1 - index]; /* Заполняем массив result */
        }
        return result;
    }
}