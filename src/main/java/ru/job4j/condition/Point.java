package ru.job4j.condition;

public class Point {
    private final int x;
    private final int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {

        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        int one = x2 - x1;
        int two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        return Math.sqrt(five);
    }

    public static void main(String[] args) {

        int x1 = 2;
        int y1 = 6;
        int x2 = 5;
        int y2 = 9;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double rsl2 = distance(x1, y1, x2, y2);
        System.out.println("x1 = " + a.x);
        System.out.println("x2 = " + b.x);
        System.out.println("y1 = " + a.y);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
        System.out.println("Расстояние между точками А и В : " + rsl2);
    }
}