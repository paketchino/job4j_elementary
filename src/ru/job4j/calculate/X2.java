package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);

       int aOne = 0;
       int bTwo = 1;
       int cThree = 1;
       int xFour = 1;
       int rslTwo = X2.calc(aOne, bTwo, cThree, xFour);
        System.out.println(rslTwo);

        int a1 = 1;
        int b2 = 1;
        int c3 = 0;
        int x4 = 1;
        int rslThree = X2.calc(a1, b2, c3, x4);
        System.out.println(rslThree);

       int a5 = 1;
       int b5 = 1;
       int c5 = 1;
       int x5 = 0;
       int rslFour = X2.calc(a5, b5, c5, x5);
        System.out.println(rslFour);
    }
}
