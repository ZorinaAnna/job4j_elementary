package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = manWeight(200);
        double woman = womanWeight(90);
        System.out.println("Man 200 is " + man);
        System.out.println("Woman 90 is " + woman);
    }
}