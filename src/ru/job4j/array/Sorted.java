package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] < array[array[index] + 1]) {
                return  true;
            }
        }
        return false;
    }
}
