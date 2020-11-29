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
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rlsTwo = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rlsTwo);
        }

    @Test
    public void whenA1B1C0X1() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rslThree = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rslThree);
    }

    @Test
    public void whenA1B1C1X0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rslFour = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rslFour);
    }
}
