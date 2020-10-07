package ru.job4j;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Roman Kulyanin";
        ArgMethod.hello(name);
    }

    private static void hello(String name) {
    }
}

