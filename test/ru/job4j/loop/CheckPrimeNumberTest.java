package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import javax.swing.*;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenPrimeNumberEqual5() {
        boolean check = CheckPrimeNumber.check(7);
      assertThat(check, is(true));
    }

    @Test
    public void whenPrimeNumberEqual8() {
        boolean check = CheckPrimeNumber.check(8);
        assertThat(check, is(false));
    }
}