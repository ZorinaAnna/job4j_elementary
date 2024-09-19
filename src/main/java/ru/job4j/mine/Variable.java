package ru.job4j.mine;

public class Variable {
    /* */
    public static void main(String[] args) {
        byte mem = 1; /* от -128 до 127 */
        System.out.println(mem);
        short size = 1; /* от -32768 до 32767 */
        System.out.println(size);
        int length = 100500; /* от - 2 в степени 31 до 2 в степени 31 минус 1 */
        System.out.println(length);
        long money = 900500; /* от - 2 в степени 63 до 2 в степени 63 минус 1 */
        System.out.println(money);
        float weight = 1.05F; /* с плавающей точкой, от 1.4e-45f до 3.4e+38f */
        System.out.println(weight);
        double distance = 100500.99; /* с плавающей точкой, от 4.9e-324 до 1.7e+308 */
        System.out.println(distance);
        boolean exists = true; /* true или false */
        System.out.println(exists);
        char gender = 'Y'; /* любой символ */
        System.out.println(gender);
    }
}