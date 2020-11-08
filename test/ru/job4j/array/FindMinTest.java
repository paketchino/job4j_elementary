package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindMinTest {

    @Test
    public void whenFirsMin() {
        assertThat(FindMin.findMin(new int[] {0, 5, 10}), is(0));

    }

    @Test
    public void whenSecondMin() {
        assertThat(FindMin.findMin(new int[] {10, 2, 8}), is(2));
    }

    @Test
    public void whenThreeMin() {
        assertThat(FindMin.findMin(new int[] {5, 4, 1}), is(1));
    }
}