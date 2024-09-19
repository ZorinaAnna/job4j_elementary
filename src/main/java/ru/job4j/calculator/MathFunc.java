package ru.job4j.calculator;

public class MathFunc {
    /* Требуется написать программу,
    которая будет вычислять эти функции и складывать их результаты */

    /* Oбъявление статического метода func1,
    который принимает один параметр типа int (названный x)
    и возвращает значение типа int */
    public static int func1(int x) {
        /* Внутри метода создается переменная y,
        которая вычисляет квадрат x и добавляет 1 к результату */
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    /* Начало метода main,
    который является точкой входа в программу. Он выполняется при запуске приложения */
    public static void main(String[] args) {
        /* Вызывается метод func1 с аргументом 3,
        и его результат сохраняется в переменной result1.
        В данном случае result1 будет равно \\(3^2 + 1 = 10\\) */
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100);
        int total = result1 + result2;

        System.out.println(total);
        System.out.println(result3);
    }
}