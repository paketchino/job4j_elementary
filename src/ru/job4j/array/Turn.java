package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            int temp = array[index]; //создал временное времнное хранилище
            array[index] = array[array.length - index - 1]; // записаем в ячейку индекс значение ячейки размер массива - 1
            array[array.length - index - 1] = temp; // записываем в ячейку с раз. массива - 1 временное хранилище
        }
        return array;
    }
}
