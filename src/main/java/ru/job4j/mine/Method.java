package ru.job4j.mine;

public class Method {

    /* В описании метода аргументы объявляются, но не содержат значений */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);

    }

    /* Чтобы выполнить метод, нужно указать имя класса и через точку имя метода.
        Назначение переменных идет при вызове метода. */
    public static void main(String[] args) {
        Method.plus(1, 2);
        Method.plus(10, 11);
    }
}