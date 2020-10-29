package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[100];
        int[] ints = new int[10];
        String[] names = {"Petr Arsentiev", "Korobeinikov Stas", "Roman Kulyanin", "Viktor"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
