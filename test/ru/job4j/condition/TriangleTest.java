package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean resultFirst = Triangle.exist(2, 2, 2);
        Boolean resultSecond = Triangle.existCount(3, 3, 3);
        assertThat(resultFirst, is(true));
        assertThat(resultSecond, is(false));
    }
}