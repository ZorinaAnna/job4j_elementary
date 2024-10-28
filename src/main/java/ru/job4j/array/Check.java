package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
    /* Для проверки, все ли элементы в массиве логических значений (boolean) одинаковы */

        boolean template = data[0]; /* эталон */
        for (int i = 1; i < data.length; i++) {
            if (data[i] != template) {
                return false;
            }
        }
        return true;
    }
}