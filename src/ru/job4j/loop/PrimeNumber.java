package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number < finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count = number;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        calc(5);
        calc(11);
        calc(2);
    }
}
