package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void powerKachki() {
        int rsl = Fitness.calc(90, 90);
        assertThat(rsl, is(1));

    }
}