package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void when20ToThen26() {
            int xOne = 2;
            int yTwo = 0;
            int xThree = 2;
            int yFour = 6;
            int expectedOne = 6;
            double outOne = Point.distance(xOne, yTwo, xThree, yFour);
            Assert.assertEquals(expectedOne, outOne, 0.01);
        }

            @Test
            public void when20ToThen24() {
                int x2 = 2;
                int y2 = 0;
                int x4 = 2;
                int y4 = 4;
                int expectedTwo = 4;
                double outTwo = Point.distance(x2, y2, x4, y4);
                Assert.assertEquals(expectedTwo, outTwo, 0.01);
            }
        }