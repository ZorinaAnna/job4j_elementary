package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        /* Для проверки, что массив word имеет последние элементы одинаковые с postfix */

        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - postfix.length + i] != postfix[i]) { /* Сравниваем элементы с конца */
                return false; /* Если есть несоответствие, возвращаем false */
            }
        }

        return true; /* Если все элементы совпадают, возвращаем true */
    }
}