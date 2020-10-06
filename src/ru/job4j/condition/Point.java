package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int x2) {
        double a = x2 - x1;
        return a;
    }
    public static double distance2(int y1, int y2) {
        double b = y1 - y2;
        return b;
    }
    public static double pow(double a, double b) {
        return StrictMath.pow(a,b);
    }
    public static void main(String[]args) {
        double result = Point.distance(0,0,2,0);
        System.out.println("result (0, 0) to (2;0)" +result);
    }
}
