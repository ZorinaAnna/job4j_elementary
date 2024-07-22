package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && second < third) {
            result = third;
        }
        if (third > first && third > second) {
            result = second;
        }
        return result;
    }
}