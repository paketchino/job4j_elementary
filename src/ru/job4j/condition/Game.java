package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        String name1 = new String("super mario");
        String name2 = new String("tanks");
        String name3 = new String("tetris");

        if (name1.equals("Super mario")) {
            System.out.println("Start - super mario");
        }
        if (name2.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name3.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
       Game.menu("super mario");
       Game.menu("tanks");
       Game.menu("tetris");

    }
}



