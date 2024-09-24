package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* Временная переменная для хранения значения первого элемента */
        array[0] = array[3]; /* Замена значения первого элемента на значение элемента с индексом 3 */
        array[3] = temp; /* Запись сохраненного значения в ячейку с индексом 3 */

        /* Вывод измененного массива 3 */
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}