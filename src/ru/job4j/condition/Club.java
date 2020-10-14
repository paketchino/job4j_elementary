package ru.job4j.condition;

public class Club {
    public static void premission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can`t.");
        }
    }

    public static void main(String[] args) {
        premission(true, true);
        premission(true, false);
        premission(false, true);
        premission(false, false);
    }
}
