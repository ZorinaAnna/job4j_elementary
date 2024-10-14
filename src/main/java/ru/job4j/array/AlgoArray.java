package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* Создание временной переменной. Теперь temp равно 5 */
        array[0] = array[3]; /* Заменяем значение первого элемента массива (array[0]) значением элемента с индексом 3
        1  3  2  1  4 */
        array[3] = temp; /* Замена элемента с индексом 3.
        Присваиваем элементу массива с индексом 3 значение переменной temp, которая содержит 5.
        Теперь элемент с индексом 3 будет равен 5*/

        temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        /* Вывод измененного массива 3 */
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}