package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        boolean condition = left > right;
        return condition ? "Условие выполняется" : "Условие не выполняется";
    }
}