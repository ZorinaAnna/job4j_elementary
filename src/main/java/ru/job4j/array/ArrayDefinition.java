package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);

        float[] prices = new float[41];
        System.out.println("Размер массива prices равен: " + prices.length);

        /* Создание массива names на 4 ячейки */
        String[] names = new String[4];

        /* Заполнение массива произвольными именами */
        names[0] = "Petr Arsentev";
        names[1] = "Anna Zorina";
        names[2] = "Varvara Mamina";
        names[3] = "Anton Ivanov";

        /* Использование цикла for-each для вывода имен */
        for (String name : names) {
            System.out.println(name);
        }
    }
}