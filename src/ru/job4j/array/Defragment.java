package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель null ячейки

                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        int notNull = i; // указатель notNull ячейки
                        String temp = array[point];
                        array[point] = array[notNull];
                        array[notNull] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
