package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index * index; // возводит в квадрат
        }
            return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(3);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        int[] arrayTwo = calculate(5);
        for (int index = 0; index < arrayTwo.length; index++) {
            System.out.println(arrayTwo[index]);
        }
    }
}