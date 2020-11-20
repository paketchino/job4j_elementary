package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price; // сдача
        for (int i = 0; i < coins.length; i++) {
            while (sum >= coins[i]) {
                sum = sum - coins[i];
                rsl[size] = coins[i]; // хранилище для хранения монет для сдачи
                size++;
            }

        }
        return Arrays.copyOf(rsl, size);
    }
}
