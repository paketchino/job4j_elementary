package ru.job4j.calculator;

public class Fit {

    public static double manWeight(float height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(float height1) {
        double rsl = (height1 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        float height = 180f;
        float height1 = 150f;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Woman " + height1 + " is " + woman);
    }
}


