package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.EqLast.check;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 6, 3};
        int[] right = {4, 2, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {5, 3, 2};
        int[] right = {4, 9, 1};
        assertThat(check(left, right), is(false));
    }

    @Test
     public void whenNotEqSecond() {
        int[] left = {3, 7, 1};
        int[] right = {5, 4, 1};
        assertThat(check(left, right), is(true));
    }
}