package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) { /* Проверка, все элементы в строке заполнены X */
        boolean result = true;
        for (int column = 0; column < board[row].length; column++) { /* Проходим по всем стобцам в сроке */
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) { /* Проверка, все элементы в колонке заполнены X */
        boolean result = true;
        for (int row = 0; row < board.length; row++) { /* Проходим по всем строкам в колонке */
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                result = monoHorizontal(board, i) || monoVertical(board, i);
                result = true;
                break;
            }
        }
        return result;
    }
}