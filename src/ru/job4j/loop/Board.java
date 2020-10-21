package ru.job4j.loop;

import jdk.swing.interop.SwingInterOpUtils;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {   // создали ряд который не превышает высоты  доски
            for (int cell = 0; cell < width; cell++) { // аналогично создали ячейку которая не превышает ширину доски
            if ((cell + row) % 2 == 0) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            paint(3, 3);
            System.out.println();
            paint(5 , 4);
        }
    }