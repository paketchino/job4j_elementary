package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void back() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = turner.back(input);
        int[] expect = new int[] {4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}