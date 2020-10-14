package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
       return result;
    }

    public static void main(String[] args) {
        int maxToMin = Max.max(1, 2);
        int secondMaxNumber = Max.max(4, 2);
        int numberSame = Max.max(5, 5);
        System.out.println(maxToMin);
        System.out.println(secondMaxNumber);
        System.out.println(numberSame);
    }
    }
