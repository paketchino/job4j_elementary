package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = (x2 - x1) + (y2 - y1);
        Math.pow(x2,x1);
        Math.pow(y2,y1);
        Math.sqrt(rsl);
        return rsl;
    }
    public static void main(String[] args) {
        double distance = Point.distance(0,0,2,0);
        double result = Point.distance(0,0,2,0);
        System.out.println("result(0,0) to (2,0)" + result);
    }
}
