package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
    /* Для создания массива, в котором каждый элемент представляет собой квадрат индекса */

        int[] result = new int[bound];
        /* заполнить массив через цикл элементами от 0 до bound, возведенными в квадрат */
        for (int index = 0; index < bound; index++) {
            result[index] = index * index;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
