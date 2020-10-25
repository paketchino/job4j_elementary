package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) { // int ivan, int nik - тяга халков
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        int rsl = calc(90, 440);
        int rsl2 = calc(90, 90);
        int rsl3 = calc(90, 95);
        System.out.println(rsl2);
        System.out.println(rsl);
        System.out.println(rsl3);
    }
}

