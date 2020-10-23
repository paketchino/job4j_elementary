package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int needPay = 0;
        while (amount <= 0) {
           needPay = (int) (salary * percent);
            year++;
        }
        return  year;
    }

    public static void main(String[] args) {
        System.out.println(year(200, 100, 50));
    }
}
