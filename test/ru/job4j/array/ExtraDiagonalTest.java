package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExtraDiagonalTest {

    @Test
    public void whenDiagonal() {
        char[][] input = {
            {'X', ' ', ' '},
            {' ', 'X', ' '},
            {' ', ' ', 'X'},
        };
        char[] result = ExtraDiagonal.extraDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }
}