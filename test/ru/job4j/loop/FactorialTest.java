package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int excepted = 120;
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int excepted = 1;
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
    }
}