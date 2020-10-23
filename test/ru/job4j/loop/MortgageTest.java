package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int rsl = Mortgage.year(200, 100, 50);
        assertThat(rsl, is(1));
    }
}