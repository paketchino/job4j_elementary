package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int remainder = 0;
        while (amount >= 0) {
            remainder = (int) (amount * (percent / 100));
            amount = (amount + remainder) - salary * 12;
            year++;
        }
        return  year;
    }

    public static void main(String[] args) {
        System.out.println(year(200, 100, 50));
        System.out.println(year(1000, 1200, 50));
    }
}
