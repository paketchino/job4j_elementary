package ru.job4j.calculator;

public class Fit {

    public static double manWeight(float height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(float height1) {
        return (height1 - 110) * 1.15;
    }

    public static void main(String[] args) {
        float height = 180f;
        float height1 = 170f;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Woman " + height1 + " is " + woman);
    }
}


