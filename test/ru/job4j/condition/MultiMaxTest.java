package ru.job4j.condition;


import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenFirstSecondThirdMax() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}