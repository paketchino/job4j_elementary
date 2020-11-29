package ru.job4j.array;

/**
 * Сортировка слиянием
 * ИНдыксы для массивов
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0, r = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l > left.length - 1) {
                int a = right[r];
                rsl[i] = a;
                r++;
            } else if (r > right.length - 1) {
                int a = left[l];
                rsl[i] = a;
                l++;
            } else if (right[r] == left[l]) {
                int a = right[r];
                rsl[i] = a;
                r++;
        } else if (left[l] < right[r]) {
                int a = left[l];
                rsl[i] = a;
                l++;
            } else {
                int a = right[r];
                rsl[i] = a;
                r++;
            }
        }
        return rsl;
    }
}


