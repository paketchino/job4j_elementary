package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            int y =  i * 2 + 3;
            System.out.println(y);
        }
    }
}
