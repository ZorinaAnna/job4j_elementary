package ru.job4j.array;

public class SimpleStringEncoder {
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static String encode(String input) { /* Для сжатия строки */

        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += symbol + Integer.toString(counter); /* Конкатенация */
                symbol = input.charAt(i);
                counter = 1; /* Сбрасываем счетчик */
            }
        }

        result += symbol + Integer.toString(counter);
        return result;
    }

    public static void main(String[] args) {
        String encoded = encode("aaabbcd");
        System.out.println(encoded);
    }
}