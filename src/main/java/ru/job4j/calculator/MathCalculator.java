package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double differenceDivide(double first, double second) {
        return MathFunction.difference(first, second) + MathFunction.divide(first, second);
    }

    @SuppressWarnings("checkstyle:OperatorWrap")
    public static double calculateAllOperations(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.difference(first, second)
                + MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumMultiply(10, 20));
        System.out.println("Результат расчета разности и деления равен: " + differenceDivide(10, 20));
        System.out.println("Результат расчета всех операций равен: " + calculateAllOperations(10, 20));
    }
}