package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int change = money - price;

        for (int coin : coins) {
            while (change >= coin) {
                int temp = change;
                change = temp - coin;
                result[size++] = coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}