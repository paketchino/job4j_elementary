package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[100];
        int[] ints = new int[10];
        String[] names = new String[4];
        names[0] = "Petr Arsentiev";
        names[1] = "Korobeinikov Stas";
        names[2] = "Roman Kulyanin";
        names[3] = "Viktor";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер массива равен: " + ints.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + ages.length);
    }
}
