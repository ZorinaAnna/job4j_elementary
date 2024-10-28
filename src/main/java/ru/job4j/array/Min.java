package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0]; /* Минимальное значение */
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) { /* Является ли текущий элемент меньше минимального */
                min = array[index]; /* Если да, обвновляем min, присваивая ему текущее значение из массива */
            }
        }
        return min;
    }
}
