package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStatsWithPrefixThenTrue() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'e'};
        boolean result = ArrayChar.statsWith(word, pref);
        assertThat(result, is(true));
    }

        @Test
        public void whenNotStartWithPrefixThenFalse() {
            char[] word1 = {'h', 'e', 'l', 'l', 'o'};
            char[] pref2 = {'h', 'i'};
            boolean result3 = ArrayChar.statsWith(word1, pref2);
            assertThat(result3, is(false));
        }
    }