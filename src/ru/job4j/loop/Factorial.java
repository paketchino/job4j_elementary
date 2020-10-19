package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int num = 1; num <= n; num++)  {
            result = result * num;
          }
        return result;
    }

    public static void main(String[] args) {
        int rsl =  Factorial.calc(5);
        System.out.println(rsl);
        int rsl2 = Factorial.calc(0);
        System.out.println(rsl2);
    }
}
