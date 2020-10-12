package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        String nameOne = new String("super mario");
        String nameTwo = new String("tanks");
        String nameThree = new String("tetris");

        if (name.equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
       Game.menu("super mario");
       Game.menu("tanks");
       Game.menu("tetris");

    }
}



