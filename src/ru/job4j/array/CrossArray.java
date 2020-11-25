package ru.job4j.array;

public class CrossArray {
    public static void printCrossArray(int[] left, int[] right) {
        for (int i : left) {
            int a = left[i];
            for (int j : right) {
                int c = right[j];
                if (a == c) {
                    System.out.println(a);
                    break;
                }
            }
        }
    }
}
