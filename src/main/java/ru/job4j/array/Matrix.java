package ru.job4j.array;

public class Matrix {

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:EmptyLineSeparator"})
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            table[0][i] = i + 1;
            table[i][0] = i + 1;
        }

        for (int i = 1; i < size; i++) {
            for (int g = 1; g < size; g++) {
                table[i][g] = table[i][0] * table[0][g];
            }
        }

        return table;
    }
}