package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        float in = 180f;
        double expected = 92;
        double out = Fit.manWeight(in);
       Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman172Then69() {
        float in = 170f;
        double expected = 69;
        double out  = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}