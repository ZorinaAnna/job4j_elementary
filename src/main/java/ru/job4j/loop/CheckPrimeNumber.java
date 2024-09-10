package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(4));
        System.out.println(check(5));
        System.out.println(check(1));
        System.out.println(check(2));
        System.out.println(check(9));
    }
}


