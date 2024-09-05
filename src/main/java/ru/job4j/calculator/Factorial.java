package ru.job4j.calculator;

public class Factorial {
    public static int calculate(int number) {
        if (number < 0) {
            System.out.println("n must be non-negative");
        }

        int result = 1;

        for (int ind = 1; ind <= number; ++ind) {
            result *= ind;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 5: " + calculate(5)); // 120
        System.out.println("Факториал 0: " + calculate(0)); // 1
        System.out.println("Факториал -1: " + calculate(-1)); // ошибк
    }
}