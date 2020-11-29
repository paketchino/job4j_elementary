package ru.job4j.array;

/**
 * Необходимо выполнить проверку числа по вертикали и горизонтали
 * Первым необходимо проверить число по горизонтали, для этого создаем цикл и добавляем переменную row(строка)
 * Когда будет найдено совпадение добавляем оператор break, что бы выйти из цикла.
 * Так как дальше проверять не имеет смысла.
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extraDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
               if (monoVertical(board, i) || monoHorizontal(board, i)) {
                   result = true;
                   break;
               }
            }
        }
        return result;
    }
}