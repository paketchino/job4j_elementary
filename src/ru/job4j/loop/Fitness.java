package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) { // int ivan, int nik - тяга халков
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++; // за что отвечает month не совсем понял
        }
        return month;
    }

    public static void main(String[] args) {
        int rsl = calc(90, 440);
        System.out.println(rsl);
    }
}

