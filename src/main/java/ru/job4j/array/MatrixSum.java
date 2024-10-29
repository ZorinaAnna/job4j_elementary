package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) { /* Определяет сумму всех элемнтов двумерного массива */
        int result = 0;

        for (int row = 0; row < array.length; row++) {

            for (int cell = 0; cell < array[row].length; cell++) {
                result = result + array[row][cell];
            }
        }
        return result;
    }
}