package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }

    public static void main(String[] args) {
        int result = max(1, 4, 2);
        System.out.println(result);
        int result1 = max(3, 3, 3);
        System.out.println(result1);
    }
}
