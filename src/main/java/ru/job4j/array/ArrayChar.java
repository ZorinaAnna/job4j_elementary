package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
    /* Для проверки, начинается ли массив символов word с заданного массива символов prefix */

        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                return false;
            }
        }
        return true;
    }
}