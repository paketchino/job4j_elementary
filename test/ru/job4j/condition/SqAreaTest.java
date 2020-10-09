package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        int expectedOne = 2;
        double outOne = SqArea.square(p, k);
        Assert.assertEquals(expectedOne, outOne, 0.01);
    }

    @Test
    public void square1() {
        int p = 4;
        int k = 1;
        int exceptedTwo = 1;
        double outTwo = SqArea.square(p, k);
        Assert.assertEquals(exceptedTwo, outTwo, 0.01);
    }
}