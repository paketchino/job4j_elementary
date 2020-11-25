package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result, is(expect));
    }
}