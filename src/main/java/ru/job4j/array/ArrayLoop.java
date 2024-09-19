package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] candies = new int[5];

        /* Заполнение массива значениями функции y = index * 2 + 3 */
        for (int index = 0; index < candies.length; index++) {
            candies[index] = index * 2 + 3;
        }

        for (int index = 0; index < candies.length; index++) {
            System.out.println(candies[index]);
        }
    }
}
