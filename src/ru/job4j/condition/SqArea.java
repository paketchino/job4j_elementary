package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }

    public static void main(String[] args) {
        int rsl = square(4, 1);
        int rsl2 = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + rsl);
        System.out.println(" p = 6, k = 2, s = 2, real =  " + rsl2);
    }
}