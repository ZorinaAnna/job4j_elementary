package ru.job4j.calculator;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
<<<<<<< HEAD
                if (row % 2 == 0 || cell % 2 == 0) {
=======
                if ((row + cell) % 2 == 0) {
>>>>>>> 928abe5 (5.3. Построить шахматную доску в псевдографике. [#13559])
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 928abe5 (5.3. Построить шахматную доску в псевдографике. [#13559])
