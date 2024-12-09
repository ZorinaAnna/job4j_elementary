package ru.job4j.mine;

public class Find {
    public static void main(String[] args) { /* Для поиска первого дубликата в массиве */
        int[] data = {1, 2, 3, 1};
        int index = findFirstDuplicate(data);
        System.out.println(index);
    }

    public static int findFirstDuplicate(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
}