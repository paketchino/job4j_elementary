package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow((x2-x1),2)+ Math.pow((y2-y1),2);
        double rsl2 = Math.sqrt(rsl);
        return rsl2;
    }
    public static void main(String[] args) {
        double result1 = Point.distance(0,0,2,0);
        System.out.println("result1 (0,0) to (2,0) " + result1);
        double result2 = Point.distance(2,0,2,6);
        System.out.println("result2 (2,0) to (2,6) " + result2);
        double result3 = Point.distance(1,1,4,4);
        System.out.println("result3 (1,1) to (4,4) " + result3);
    }
    }
