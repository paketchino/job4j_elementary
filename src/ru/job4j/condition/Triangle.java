package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean exist = (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
        return exist;
    }

    public static boolean existCount(double ab, double ac, double bc) {
        boolean exist = (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(exist(2, 2, 2));
        System.out.println(existCount(1, 2, 3));
    }
}
