package ru.job4j.array;

public class MatrixLoop {

    public static void main(String[] args) { /* Программа проходит по всем элементам двумерного массива и выводит их */
        int[][] array = {
                {4, 2, 3},
                {7, 1},
                {3, 5, 6, 4}
        };
        for (int row = 0; row < array.length; row++) { /* Цикл возвращает количество строк в массиве (3) */
            for (int cell = 0; cell < array[row].length; cell++) { /* Вложенный возвращает количество элементов в текущей строке */
                int val = array[row][cell]; /* Присваиваем val значение текущего элемента массива, к которому обращаемся по индексам row и cell */
                System.out.println(val);
            }
        }
    }
}