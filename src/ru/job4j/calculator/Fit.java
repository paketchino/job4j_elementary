package ru.job4j.calculator;

public class Fit {

    public static double manWeight(float heightMan) {
        return (heightMan - 100) * 1.15;
    }

    public static double womanWeight(float heightWoman) {
        return (heightWoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        float heightMan = 180f;
        float heightWoman = 170f;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man " + heightMan + " is " + man);
        System.out.println("Woman " + heightWoman + " is " + woman);
    }
}


