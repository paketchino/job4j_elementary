package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        /* Входные параметры */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение. Эта всегда лишь одна переменная */
        int excepted1 = 3;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rslOne = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(excepted1, rslOne);
    }

    @Test
    public void whenA0B1C1X1() {
        int aOne = 0;
        int bTwo = 1;
        int cThree = 1;
        int xFour = 1;
        int expected2 = 2;
        int rlsTwo = X2.calc(aOne, bTwo, cThree, xFour);
        Assert.assertEquals(expected2, rlsTwo);
        }

    @Test
    public void whenA1B1C0X1() {
        int a1 = 1;
        int b2 = 1;
        int c3 = 0;
        int x4 = 1;
        int expected3 = 2;
        int rslThree = X2.calc(a1, b2, c3, x4);
        Assert.assertEquals(expected3, rslThree);
    }

    @Test
    public void whenA1B1C1X0() {
        int a5 = 1;
        int b5 = 1;
        int c5 = 1;
        int x5 = 0;
        int expected4 = 1;
        int rslFour = X2.calc(a5, b5, c5, x5);
        Assert.assertEquals(expected4, rslFour);
    }
}
