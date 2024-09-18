package ru.job4j.calculator;

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;

        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int sixDivTwo = six / two;
        System.out.println(sixDivTwo);

        int fiveMinusTwo = five - two;
        System.out.println(fiveMinusTwo);

        int fourTimesTwo = four * two;
        System.out.println(fourTimesTwo);

        System.out.println(plus(100, 500));
        System.out.println(plus(4, 2));
        System.out.println(plus(3, 5));
    }
}