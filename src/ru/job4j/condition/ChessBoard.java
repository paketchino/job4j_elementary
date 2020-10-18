package ru.job4j.condition;
import java.lang.Math;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
      int result = 0;
      if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
          result = Math.abs(x2 - x1);
       }
       return result;
    }

    public static void main(String[] args) {
        int rsl = way(6, 7, 1, 2);
        System.out.println("Количество ходов которые совершил слон: " + rsl);
        int rsl2 = way(7, 0, 0, 7);
        System.out.println("Количество ходов которые совершил слон: " + rsl2);
        int rsl3 = way(2, 6, 4, 1);
        System.out.println("Количество ходов которые совершил слон: " + rsl3);
        int rsl4 = way(5, 0, 7, 2);
        System.out.println("Количество ходов которые совершил слон: " + rsl4);
    }
    }

