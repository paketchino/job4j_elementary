package ru.job4j.calculator;

public class Fit {

    public static double manWeight (short height) {
        double rsl = (179 - 100) * 1.15;
        return rsl;
    }

    public  static double womanWeight(short height) {
        double rsl =  (170 - 110) * 1.15;
        return rsl;
    }
    public static void main(String [] args) {
        short height = 179;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 179 is" + man);
        System.out.println("Woman 170 is " + woman);
    }
}