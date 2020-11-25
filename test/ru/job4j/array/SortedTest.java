package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortedTest {

    @Test
    public void isSorted() {
        assertThat(Sorted.isSorted(
                new int[] {1, 2, 3}
                ),
                is(true)
        );
    }
}