package ru.job4j;

class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int bonusCoffee = 0;
        for (int i = 1; i <= count; i++) {
            bonusCoffee = i / n;
        }
          return bonusCoffee;

        }
    }